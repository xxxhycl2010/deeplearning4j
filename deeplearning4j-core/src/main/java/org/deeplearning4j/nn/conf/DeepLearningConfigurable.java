package org.deeplearning4j.nn.conf;


import org.canova.api.conf.Configuration;

public interface DeepLearningConfigurable {
	/* Number of passes to do on the data applyTransformToDestination */
	public final static String NUM_PASSES = "org.deeplearning4j.numpasses";

    public final static String CLASS = "org.deeplearning4j.class";

    public final static String MASTER_PATH = "org.deeplearning4j.scaleout.masterpath";
    public final static String MASTER_URL = "org.deeplearning4j.scaleout.masterurl";
    public final static String STATE_TRACKER_CONNECTION_STRING = "org.deeplearning4j.scaleout.statetracker.connectionstring";

    public final static String MULTI_LAYER_CONF = "org.deeplearning4j.scaleout.multilayerconf";
    public final static String NEURAL_NET_CONF = "org.deeplearning4j.scaleout.neuralnetconf";

    void setup(Configuration conf);
}

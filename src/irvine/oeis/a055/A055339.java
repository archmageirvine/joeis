package irvine.oeis.a055;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A055339 Number of asymmetric (identity) trees with n nodes and 8 leaves.
 * @author Georg Fischer
 */
public class A055339 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A055339() {
    super(9, A055278.computeRecurrence(8), "1, 27, 172, 798, 2866, 8879, 24308, 60812, 140884, 306890, 633610, 1250265, 2370223, 4339340, 7699607, 13286899, 22357092, 36771118, 59229576, 93604439, 145353364, 222087798, 334273110, 496164369, 726946124, 1052222818", 0);
  }
}


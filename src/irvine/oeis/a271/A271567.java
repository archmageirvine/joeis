package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271567 Convolution of nonzero triangular numbers (A000217) and nonzero tetradecagonal numbers (A051866).
 * @author Sean A. Irvine
 */
public class A271567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271567() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 17, 87, 287, 742, 1638});
  }
}

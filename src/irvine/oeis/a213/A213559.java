package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213559 Principal diagonal of the convolution array A213558.
 * @author Sean A. Irvine
 */
public class A213559 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213559() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 91, 1366, 9542, 43535, 151313, 435324, 1089804});
  }
}

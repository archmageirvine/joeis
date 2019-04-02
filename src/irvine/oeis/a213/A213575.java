package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213575 Antidiagonal sums of the convolution array A213573.
 * @author Sean A. Irvine
 */
public class A213575 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213575() {
    super(new long[] {2, -9, 16, -14, 6}, new long[] {1, 10, 47, 158, 441});
  }
}

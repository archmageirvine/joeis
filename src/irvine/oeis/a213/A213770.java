package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213770 Antidiagonal sums of the convolution array A213768.
 * @author Sean A. Irvine
 */
public class A213770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213770() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 7, 23, 58, 126});
  }
}

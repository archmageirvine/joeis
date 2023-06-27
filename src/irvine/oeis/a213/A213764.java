package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213764 Antidiagonal sums of the convolution array A213762.
 * @author Sean A. Irvine
 */
public class A213764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213764() {
    super(1, new long[] {-2, 7, -9, 5}, new long[] {1, 8, 31, 90});
  }
}

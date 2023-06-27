package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213834 Antidiagonal sums of the convolution array A213833.
 * @author Sean A. Irvine
 */
public class A213834 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213834() {
    super(1, new long[] {1, -5, 10, -10, 5}, new long[] {1, 10, 46, 140, 335});
  }
}

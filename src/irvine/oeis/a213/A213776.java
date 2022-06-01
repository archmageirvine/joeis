package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213776 Antidiagonal sums of the convolution array A213774.
 * @author Sean A. Irvine
 */
public class A213776 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213776() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 8, 30, 81, 184});
  }
}

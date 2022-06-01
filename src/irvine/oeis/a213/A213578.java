package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213578 Antidiagonal sums of the convolution array A213576.
 * @author Sean A. Irvine
 */
public class A213578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213578() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 4, 13, 34, 80, 174});
  }
}

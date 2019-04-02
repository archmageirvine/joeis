package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213767 Antidiagonal sums of the convolution array A213765.
 * @author Sean A. Irvine
 */
public class A213767 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213767() {
    super(new long[] {-1, 0, 4, -2, -4, 4}, new long[] {1, 5, 17, 47, 114, 254});
  }
}

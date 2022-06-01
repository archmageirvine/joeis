package irvine.oeis.a213;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A213586 Antidiagonal sums of the convolution array A213584.
 * @author Sean A. Irvine
 */
public class A213586 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213586() {
    super(new long[] {-1, 2, 1, -5, 4}, new long[] {1, 6, 20, 51, 112});
  }
}

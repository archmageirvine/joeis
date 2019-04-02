package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213589 Antidiagonal sums of the convolution array A213587.
 * @author Sean A. Irvine
 */
public class A213589 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213589() {
    super(new long[] {1, 3, 0, -5, 0, 3}, new long[] {1, 6, 20, 55, 135, 308});
  }
}

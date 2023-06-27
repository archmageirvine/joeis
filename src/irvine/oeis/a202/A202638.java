package irvine.oeis.a202;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A202638 y-values in the solution to x^2 - 7*y^2 = -3.
 * @author Sean A. Irvine
 */
public class A202638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A202638() {
    super(1, new long[] {-1, 0, 16, 0}, new long[] {1, 2, 14, 31});
  }
}

package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105867 A generalized Chebyshev transform of the Jacobsthal numbers.
 * @author Sean A. Irvine
 */
public class A105867 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105867() {
    super(new long[] {-4, -2, 6, 1}, new long[] {0, 1, 1, 7});
  }
}

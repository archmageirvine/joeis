package irvine.oeis.a105;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A105866 A generalized Chebyshev transform of the Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A105866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A105866() {
    super(new long[] {-4, -2, 5, 1}, new long[] {0, 1, 1, 6});
  }
}

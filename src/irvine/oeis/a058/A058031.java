package irvine.oeis.a058;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A058031 a(n) = n^4 - 2*n^3 + 3*n^2 - 2*n + 1, the Alexander polynomial for reef and granny knots.
 * @author Sean A. Irvine
 */
public class A058031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058031() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 9, 49, 169});
  }
}

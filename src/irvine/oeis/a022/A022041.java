package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022041 a(n) = 3*a(n-1)+a(n-2)-a(n-3)+a(n-6)-a(n-7)+a(n-10)-a(n-11).
 * @author Sean A. Irvine
 */
public class A022041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022041() {
    super(new long[] {-1, 1, 0, 0, -1, 1, 0, 0, -1, 1, 3}, new long[] {2, 6, 19, 61, 196, 630, 2026, 6516, 20957, 67403, 216786});
  }
}

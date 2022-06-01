package irvine.oeis.a238;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A238823 a(n) = 3*a(n-1)-4*a(n-3)+a(n-4)+a(n-5)+3*a(n-6)-a(n-7) for n &gt;= 8, with initial values as shown.
 * @author Sean A. Irvine
 */
public class A238823 extends LinearRecurrence {

  /** Construct the sequence. */
  public A238823() {
    super(new long[] {-1, 3, 1, 1, -4, 0, 3}, new long[] {2, 3, 6, 14, 34, 84, 208});
  }
}

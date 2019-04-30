package irvine.oeis.a289;

import irvine.oeis.LinearRecurrence;

/**
 * A289004 <code>a(n) = 2*a(n-1) - a(n-2) + 2*a(n-4) - a(n-5) + a(n-7) - a(n-8) - a(n-10)</code> for <code>n &gt;= 10</code>, where <code>a(0) = 2, a(1) = 4, a(2) = 7, a(3) = 11, a(4) = 18, a(5) = 31, a(6) = 52, a(7) = 89, a(9) = 151, a(9) = 257</code>.
 * @author Sean A. Irvine
 */
public class A289004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A289004() {
    super(new long[] {-1, 0, -1, 1, 0, -1, 2, 0, -1, 2}, new long[] {2, 4, 7, 11, 18, 31, 52, 89, 151, 257});
  }
}

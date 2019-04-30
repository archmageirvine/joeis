package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288925 <code>a(n) = a(n-1) + a(n-2) + 3*a(n-4) - 2*a(n-5)</code> for <code>n &gt;= 5</code>, where <code>a(0) = 2, a(1) = 4, a(2) = 8, a(3) = 13, a(4) = 26</code>.
 * @author Sean A. Irvine
 */
public class A288925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288925() {
    super(new long[] {-2, 3, 0, 1, 1}, new long[] {2, 4, 8, 13, 26});
  }
}

package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288380 <code>a(n) = 3*a(n-1) - 3*a(n-2) + 3*a(n-3) - 3*a(n-4) + a(n-5)</code> for <code>n &gt;= 1,</code> where <code>a(0) = 2, a(1) = 4, a(2) = 7. a(3) = 11, a(4) = 20</code>.
 * @author Sean A. Irvine
 */
public class A288380 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288380() {
    super(new long[] {1, -3, 3, -3, 3}, new long[] {2, 4, 7, 11, 20});
  }
}

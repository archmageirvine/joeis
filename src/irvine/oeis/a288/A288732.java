package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288732 <code>a(n) = a(n-1) + 2*a(n-4) - 2*a(n-5)</code> for <code>n &gt;= 5</code>, where <code>a(0) = 2, a(1) = 4, a(2) = 6, a(3) = 8, a(4) = 10</code>.
 * @author Sean A. Irvine
 */
public class A288732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288732() {
    super(new long[] {-2, 2, 0, 0, 1}, new long[] {2, 4, 6, 8, 10});
  }
}

package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288668 <code>a(n) = a(n-2) + 2*a(n-3)</code> for <code>n &gt;= 3,</code> where <code>a(0) = 2, a(2) = 4, a(3) = 5</code>.
 * @author Sean A. Irvine
 */
public class A288668 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288668() {
    super(new long[] {2, 1, 0}, new long[] {2, 4, 5});
  }
}

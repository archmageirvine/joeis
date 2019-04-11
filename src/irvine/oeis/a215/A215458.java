package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215458 <code>a(n) = 4*a(n-1) - 7*a(n-2) + 8*a(n-3) - 4*a(n-4)</code> starting <code>0, 1, 4, 7</code>.
 * @author Sean A. Irvine
 */
public class A215458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215458() {
    super(new long[] {-4, 8, -7, 4}, new long[] {0, 1, 4, 7});
  }
}

package irvine.oeis.a215;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A215458 a(n) = 4*a(n-1) - 7*a(n-2) + 8*a(n-3) - 4*a(n-4) starting 0, 1, 4, 7.
 * @author Sean A. Irvine
 */
public class A215458 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215458() {
    super(new long[] {-4, 8, -7, 4}, new long[] {0, 1, 4, 7});
  }
}

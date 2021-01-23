package irvine.oeis.a215;

import irvine.oeis.LinearRecurrence;

/**
 * A215004 a(0) = a(1) = 1; for n&gt;1, a(n) = a(n-1) + a(n-2) + floor(n/2).
 * @author Sean A. Irvine
 */
public class A215004 extends LinearRecurrence {

  /** Construct the sequence. */
  public A215004() {
    super(new long[] {1, 0, -3, 1, 2}, new long[] {1, 1, 3, 5, 10});
  }
}

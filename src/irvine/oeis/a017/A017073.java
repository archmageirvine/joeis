package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017073 a(n) = (8*n)^9.
 * @author Sean A. Irvine
 */
public class A017073 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017073() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 134217728, 68719476736L, 2641807540224L, 35184372088832L, 262144000000000L, 1352605460594688L, 5416169448144896L, 18014398509481984L, 51998697814228992L});
  }
}

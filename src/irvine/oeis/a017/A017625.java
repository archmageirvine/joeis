package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017625 (12n+8)^9.
 * @author Sean A. Irvine
 */
public class A017625 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017625() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {134217728, 512000000000L, 35184372088832L, 618121839509504L, 5416169448144896L, 31087100296429568L, 134217728000000000L, 472161363286556672L, 1423311812421484544L, 3802961274698203136L});
  }
}

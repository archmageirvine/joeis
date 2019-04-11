package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016941 <code>a(n) = (6*n + 2)^9</code>.
 * @author Sean A. Irvine
 */
public class A016941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016941() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {512, 134217728, 20661046784L, 512000000000L, 5429503678976L, 35184372088832L, 165216101262848L, 618121839509504L, 1953125000000000L, 5416169448144896L});
  }
}

package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017373 a(n) = (10*n + 8)^9.
 * @author Sean A. Irvine
 */
public class A017373 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017373() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {134217728, 198359290368L, 10578455953408L, 165216101262848L, 1352605460594688L, 7427658739644928L, 31087100296429568L, 106868920913284608L, 316478381828866048L, 833747762130149888L});
  }
}

package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017445 a(n) = (11*n + 4)^9.
 * @author Sean A. Irvine
 */
public class A017445 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017445() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {262144, 38443359375L, 5429503678976L, 129961739795077L, 1352605460594688L, 8662995818654939L, 40353607000000000L, 150094635296999121L, 472161363286556672L, 1304773183829244583L});
  }
}

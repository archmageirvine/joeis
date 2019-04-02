package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017385 a(n) = (10*n + 9)^9.
 * @author Sean A. Irvine
 */
public class A017385 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017385() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {387420489, 322687697779L, 14507145975869L, 208728361158759L, 1628413597910449L, 8662995818654939L, 35452087835576229L, 119851595982618319L, 350356403707485209L, 913517247483640899L});
  }
}

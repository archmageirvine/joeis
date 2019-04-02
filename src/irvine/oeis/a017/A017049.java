package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017049 a(n) = (7*n + 5)^9.
 * @author Sean A. Irvine
 */
public class A017049 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017049() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1953125, 5159780352L, 322687697779L, 5429503678976L, 46411484401953L, 262144000000000L, 1119130473102767L, 3904305912313344L, 11694146092834141L, 31087100296429568L});
  }
}

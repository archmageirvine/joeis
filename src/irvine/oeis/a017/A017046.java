package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017046 a(n) = (7*n + 5)^6.
 * @author Sean A. Irvine
 */
public class A017046 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017046() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15625, 2985984, 47045881, 308915776, 1291467969, 4096000000L, 10779215329L});
  }
}

package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017526 a(n) = (12*n)^6.
 * @author Sean A. Irvine
 */
public class A017526 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017526() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 2985984, 191102976, 2176782336L, 12230590464L, 46656000000L, 139314069504L});
  }
}

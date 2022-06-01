package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017070 a(n) = (8*n)^6.
 * @author Sean A. Irvine
 */
public class A017070 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017070() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 262144, 16777216, 191102976, 1073741824, 4096000000L, 12230590464L});
  }
}

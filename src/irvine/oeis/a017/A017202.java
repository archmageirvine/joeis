package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017202 a(n) = (9*n + 3)^6.
 * @author Sean A. Irvine
 */
public class A017202 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017202() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {729, 2985984, 85766121, 729000000, 3518743761L, 12230590464L, 34296447249L});
  }
}

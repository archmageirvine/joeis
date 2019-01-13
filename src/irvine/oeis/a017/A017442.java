package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017442.
 * @author Sean A. Irvine
 */
public class A017442 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017442() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {4096, 11390625, 308915776, 2565726409L, 12230590464L, 42180533641L, 117649000000L});
  }
}

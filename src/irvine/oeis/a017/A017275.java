package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017275.
 * @author Sean A. Irvine
 */
public class A017275 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017275() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 10000000, 1280000000, 21870000000L, 163840000000L, 781250000000L, 2799360000000L, 8235430000000L});
  }
}

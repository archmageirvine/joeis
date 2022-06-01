package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017143 a(n) = (8*n+6)^7.
 * @author Sean A. Irvine
 */
public class A017143 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017143() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {279936, 105413504, 2494357888L, 21870000000L, 114415582592L, 435817657216L, 1338925209984L, 3521614606208L});
  }
}

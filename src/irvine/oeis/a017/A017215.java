package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017215 a(n) = (9*n + 4)^7.
 * @author Sean A. Irvine
 */
public class A017215 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017215() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 62748517, 2494357888L, 27512614111L, 163840000000L, 678223072849L, 2207984167552L, 6060711605323L});
  }
}

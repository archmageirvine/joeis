package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017072 a(n) = (8*n)^8.
 * @author Sean A. Irvine
 */
public class A017072 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017072() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 16777216, 4294967296L, 110075314176L, 1099511627776L, 6553600000000L, 28179280429056L, 96717311574016L, 281474976710656L});
  }
}

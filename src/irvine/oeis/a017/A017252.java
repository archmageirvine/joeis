package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017252 a(n) = (9*n + 7)^8.
 * @author Sean A. Irvine
 */
public class A017252 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017252() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {5764801, 4294967296L, 152587890625L, 1785793904896L, 11688200277601L, 53459728531456L, 191707312997281L, 576480100000000L, 1517108809906561L});
  }
}

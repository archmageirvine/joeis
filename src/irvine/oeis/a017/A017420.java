package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017420.
 * @author Sean A. Irvine
 */
public class A017420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017420() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {256, 815730721, 110075314176L, 2251875390625L, 20047612231936L, 111429157112001L, 457163239653376L, 1517108809906561L, 4304672100000000L});
  }
}

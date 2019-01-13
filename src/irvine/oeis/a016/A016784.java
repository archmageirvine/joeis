package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016784.
 * @author Sean A. Irvine
 */
public class A016784 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016784() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 65536, 5764801, 100000000, 815730721, 4294967296L, 16983563041L, 54875873536L, 152587890625L});
  }
}

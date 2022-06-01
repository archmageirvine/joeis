package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017119 a(n) = (8*n + 4)^7 = 4^7*(2*n + 1)^7.
 * @author Sean A. Irvine
 */
public class A017119 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017119() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {16384, 35831808, 1280000000, 13492928512L, 78364164096L, 319277809664L, 1028071702528L, 2799360000000L});
  }
}

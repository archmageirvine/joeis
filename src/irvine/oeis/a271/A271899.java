package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271899 a(n) = 1 + 471*n/140 + 1594*n^2/315 + 73*n^3/16 + 161*n^4/60 + 83*n^5/80 + 61*n^6/240 + n^7/28 + 11*n^8/5040.
 * @author Sean A. Irvine
 */
public class A271899 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271899() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 18, 162, 927, 3906, 13248, 38256, 97614, 225819});
  }
}

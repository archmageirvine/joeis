package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098995 Number of permutations of [n] with exactly 4 descents which avoid the pattern 1324.
 * @author Sean A. Irvine
 */
public class A098995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098995() {
    super(new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {0, 0, 0, 0, 1, 57, 812, 6524, 37309, 169298, 648216, 2176923, 6582869, 18262399, 47129249, 114344261, 262987603});
  }
}

package irvine.oeis.a022;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A022468 Number of <code>3</code>'s in n-th term of <code>A007651</code>.
 * @author Sean A. Irvine
 */
public class A022468 extends GeneratingFunctionSequence {

  // After Peter J. C. Moses

  /** Construct the sequence. */
  public A022468() {
    super(new long[] {0, 0, 0, 0, 0, 1, 0, 0, -1, -1, 0, -1, 1, 2, 3, 2, -6, -9, -1, 7, 14, 7, -12, -9, -9, 0, 10, -5, 9, 6, 14, -7, -24, -33, 24, 24, 43, -27, -17, -25, -3, 23, -11, 16, 3, -1, 9, -44, 36, -10, -6, 15, -20, 35, -31, 16, -18, 9, 5, -11, -10, 8, 3, 10, 10, -21, 0, 2, -13, 43, -28, 12, -25, 14, 12, -18, 11, -15, 10},
      new long[] {1, -1, -1, -1, 1, 3, 0, -1, -2, 0, 0, 0, 0, 3, 3, -2, -5, -8, 7, 1, 8, 0, -5, 8, -12, -4, -1, 0, 18, -4, 2, -13, -7, 19, -14, 14, -6, -4, 13, -9, -7, 4, -8, 7, 5, 7, -12, 17, -22, 8, -7, 16, -6, -7, -6, 3, 19, -5, -5, -14, 8, 2, 7, -5, 1, -8, 14, -11, 16, -18, 9, -9, 6});
  }
}

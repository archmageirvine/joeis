package irvine.oeis.a022;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A022472 Number of 1's in n-th term of A022470.
 * @author Sean A. Irvine
 */
public class A022472 extends GeneratingFunctionSequence {

  // After Peter J. C. Moses

  /** Construct the sequence. */
  public A022472() {
    super(new long[] {0, -1, -2, 2, 3, 1, -1, -2, -2, 1, 3, -3, 1, 0, -1, -4, 2, 1, 1, 15, -3, -8, -1, -21, 10, 13, -3, -2, 5, -3, -12, 16, -12, 18, 21, -33, 2, -14, -30, 35, 24, -6, -17, 16, -17, 19, -9, -13, 23, 6, -21, -12, -8, 12, 17, -1, 2, -11, 0, -12, 13, 13, 3, -13, 0, -10, 19, -5, -6, 1, -6, 5, 2},
      new long[] {-1, 1, 1, 1, -1, -3, 0, 1, 2, 0, 0, 0, 0, -3, -3, 2, 5, 8, -7, -1, -8, 0, 5, -8, 12, 4, 1, 0, -18, 4, -2, 13, 7, -19, 14, -14, 6, 4, -13, 9, 7, -4, 8, -7, -5, -7, 12, -17, 22, -8, 7, -16, 6, 7, 6, -3, -19, 5, 5, 14, -8, -2, -7, 5, -1, 8, -14, 11, -16, 18, -9, 9, -6});
  }
}

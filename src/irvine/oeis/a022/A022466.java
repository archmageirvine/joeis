package irvine.oeis.a022;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A022466 Number of 1's in n-th term of A007651.
 * @author Sean A. Irvine
 */
public class A022466 extends GeneratingFunctionSequence {

  // After Peter J. C. Moses

  /** Construct the sequence. */
  public A022466() {
    super(new long[] {1, 2, 0, -1, -2, -2, -1, -1, 3, 7, 2, -5, -9, -2, 6, 6, 2, 1, 2, 3, -3, -9, -23, -7, 36, 35, 15, -39, -55, 18, 21, 13, -23, -19, 47, 15, -5, -53, -44, 44, 55, 7, 10, -99, -5, 36, 18, 42, -43, -91, 4, 29, 53, -25, -20, -35, -25, 14, 5, 38, 73, -19, -52, 12, 8, 40, -22, 9, -3, 21, -33, -18, -10, 26, -13, 15, -3, 10},
      new long[] {1, 0, -1, -2, -1, 2, 2, 1, -1, -1, -1, -1, -1, 2, 5, 3, -2, -10, -3, -2, 6, 6, 1, 9, -3, -7, -8, -8, 10, 6, 8, -5, -12, 7, -7, 7, 1, -3, 10, 1, -6, -2, -10, -3, 2, 9, -3, 14, -8, 0, -7, 9, 3, -4, -10, -7, 12, 7, 2, -12, -4, -2, 5, 0, 1, -7, 7, -4, 12, -6, 3, -6});
  }
}

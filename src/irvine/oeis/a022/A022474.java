package irvine.oeis.a022;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A022474 Number of 3's in n-th term of A022470.
 * @author Sean A. Irvine
 */
public class A022474 extends GeneratingFunctionSequence {

  // After Peter J. C. Moses

  /** Construct the sequence. */
  public A022474() {
    super(new long[] {0, 0, 0, -1, 0, 1, 1, 0, -1, -2, 1, 3, 0, -1, 1, -3, 0, -5, 2, 0, 11, -2, -6, 4, -9, 10, 0, -8, 7, -6, 5, 0, -8, 3, -8, 18, -10, 12, -3, -4, -6, 2, -8, 12, 3, 0, -6, 5, -15, 16, -9, 2, 1, -4, 5, -2, 4, -6, 8, -11, 10, -12, 10, -5, 5, -6, 6, -4, 9, -12, 7, -7, 4},
      new long[] {-1, 1, 1, 1, -1, -3, 0, 1, 2, 0, 0, 0, 0, -3, -3, 2, 5, 8, -7, -1, -8, 0, 5, -8, 12, 4, 1, 0, -18, 4, -2, 13, 7, -19, 14, -14, 6, 4, -13, 9, 7, -4, 8, -7, -5, -7, 12, -17, 22, -8, 7, -16, 6, 7, 6, -3, -19, 5, 5, 14, -8, -2, -7, 5, -1, 8, -14, 11, -16, 18, -9, 9, -6});
  }
}

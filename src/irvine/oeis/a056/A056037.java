package irvine.oeis.a056;

import irvine.oeis.FiniteSequence;

/**
 * A056037 Number of 6x6 binary matrices with n ones, with no zero rows or columns, up to row and column permutation.
 * @author Georg Fischer
 */
public class A056037 extends FiniteSequence {

  /** Construct the sequence. */
  public A056037() {
    super(6, FINITE, 1, 2, 15, 69, 288, 840, 2144, 4488, 8317, 13160, 18636, 23078, 25856, 25623, 23187, 18713, 13932, 9288, 5816, 3256, 1767, 858, 419, 180, 88, 34, 16, 6, 3, 1, 1);
  }
}

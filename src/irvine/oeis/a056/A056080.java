package irvine.oeis.a056;

import irvine.oeis.FiniteSequence;

/**
 * A056080 Number of 5 X 5 binary matrices with n ones, with no zero rows or columns, up to row and column permutation.
 * @author Georg Fischer
 */
public class A056080 extends FiniteSequence {

  /** Construct the sequence. */
  public A056080() {
    super(5, FINITE, 1, 2, 14, 49, 131, 248, 410, 531, 601, 566, 474, 336, 222, 124, 67, 32, 16, 6, 3, 1, 1);
  }
}

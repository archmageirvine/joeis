package irvine.oeis.a190;

import irvine.oeis.FiniteSequence;

/**
 * A190298 Numbers less than or equal to sum of the triangular number of each of their decimal digits.
 * @author Georg Fischer
 */
public class A190298 extends FiniteSequence {

  /** Construct the sequence. */
  public A190298() {
    super(1, FINITE, 1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 16, 17, 18, 19, 27, 28, 29, 38, 39, 49);
  }
}

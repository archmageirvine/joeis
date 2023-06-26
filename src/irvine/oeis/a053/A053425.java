package irvine.oeis.a053;

import irvine.oeis.FiniteSequence;

/**
 * A053425 Even numbers n such that the 120 points of the 600-cell exactly integrate homogeneous polynomials of degree n.
 * @author Georg Fischer
 */
public class A053425 extends FiniteSequence {

  /** Construct the sequence. */
  public A053425() {
    super(1, FINITE, 14, 16, 18, 22, 26, 28, 34, 38, 46, 58);
  }
}

package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173346 Numbers such that the product of numbers of 0's and 1's in the binary representation is equal to the square root of the number.
 * @author Georg Fischer
 */
public class A173346 extends FiniteSequence {

  /** Construct the sequence. */
  public A173346() {
    super(1, FINITE, 0, 4, 16, 144, 324, 625);
  }
}

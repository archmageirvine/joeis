package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173346 Numbers such that the product of numbers of <code>0</code>'s and <code>1</code>'s in the binary representation is equal to the square root of the number.
 * @author Georg Fischer
 */
public class A173346 extends FiniteSequence {

  /** Construct the sequence. */
  public A173346() {
    super(0, 4, 16, 144, 324, 625);
  }
}

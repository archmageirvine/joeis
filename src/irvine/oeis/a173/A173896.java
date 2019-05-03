package irvine.oeis.a173;

import irvine.oeis.FiniteSequence;

/**
 * A173896 Exponents in the prime factorization of 43252003274489856000, the number of possible moves for a <code>3 X 3 X 3</code> Rubik's Cube: <code>2^27 * 3^14 * 5^3 * 7^2 * 11^1</code>.
 * @author Georg Fischer
 */
public class A173896 extends FiniteSequence {

  /** Construct the sequence. */
  public A173896() {
    super(27, 14, 3, 2, 1);
  }
}

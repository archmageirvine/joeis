package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171551 Numbers k such that the decimal expansion of 3^k - 2^k contains no pair of consecutive equal digits (probably finite).
 * @author Georg Fischer
 */
public class A171551 extends FiniteSequence {

  /** Construct the sequence. */
  public A171551() {
    super(0, 1, 2, 3, 4, 7, 8, 9, 10, 12, 13, 15, 18, 20, 21, 22, 23, 24, 26, 27, 29, 37, 50);
  }
}

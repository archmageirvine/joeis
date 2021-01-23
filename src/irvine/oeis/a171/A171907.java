package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171907 a(n)= Number of 5 X 5 permutation matrices with trace n and determinant +1.
 * @author Georg Fischer
 */
public class A171907 extends FiniteSequence {

  /** Construct the sequence. */
  public A171907() {
    super(24, 15, 20, 0, 0, 1);
  }
}

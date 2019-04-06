package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171489 a(n)=k is the smallest exponent k such that at least 4 equal decimal digits "n n n n" appear in the decimal representation of 2^k (n=0,1,...,9).
 * @author Georg Fischer
 */
public class A171489 extends FiniteSequence {

  /** Construct the sequence. */
  public A171489() {
    super(377, 313, 314, 219, 192, 41, 220, 181, 180, 421);
  }
}

package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171242 a(n)=k is the smallest exponent k such that at least 3 equal decimal digits &quot;n n n&quot; appear in the decimal representation of 2^k (n=0,1,...,9).
 * @author Georg Fischer
 */
public class A171242 extends FiniteSequence {

  /** Construct the sequence. */
  public A171242() {
    super(242, 42, 43, 83, 44, 41, 157, 24, 39, 50);
  }
}

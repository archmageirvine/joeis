package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171489 <code>a(n)=k</code> is the smallest exponent k such that at least 4 equal decimal digits "n <code>n n</code> n" appear in the decimal representation of <code>2^k (n=0,1,...,9)</code>.
 * @author Georg Fischer
 */
public class A171489 extends FiniteSequence {

  /** Construct the sequence. */
  public A171489() {
    super(377, 313, 314, 219, 192, 41, 220, 181, 180, 421);
  }
}

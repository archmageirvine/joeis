package irvine.oeis.a171;

import irvine.oeis.FiniteSequence;

/**
 * A171617 <code>a(n)=k</code> is the smallest exponent of <code>N=2^k</code> of first <code>prime(1)=2</code> where at least 5 equal decimal digits "n <code>n n n</code> n" appear in the decimal representation of N <code>(n=0,1,...9)</code>.
 * @author Georg Fischer
 */
public class A171617 extends FiniteSequence {

  /** Construct the sequence. */
  public A171617() {
    super(1491, 485, 314, 221, 315, 973, 220, 317, 316, 422);
  }
}

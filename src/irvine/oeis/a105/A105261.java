package irvine.oeis.a105;

import irvine.oeis.FiniteSequence;

/**
 * A105261 Values of n such that phi(n)=c(n)^2, where phi is the Euler totient function and c(n) is the product of the distinct prime factors of n (c(1)=1).
 * @author Georg Fischer
 */
public class A105261 extends FiniteSequence {

  /** Construct the sequence. */
  public A105261() {
    super(1, FINITE, 1, 8, 108, 250, 6174, 41154);
  }
}

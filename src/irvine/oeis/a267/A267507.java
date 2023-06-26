package irvine.oeis.a267;

import irvine.oeis.FiniteSequence;

/**
 * A267507 Prime numbers n such that n-1 is squarefree and all prime divisors of n-1 other than 19 are in the sequence.
 * @author Georg Fischer
 */
public class A267507 extends FiniteSequence {

  /** Construct the sequence. */
  public A267507() {
    super(1, FINITE, 2, 3, 7, 43, 4903, 168241543L, 5773040306503L);
  }
}

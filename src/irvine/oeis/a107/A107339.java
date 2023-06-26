package irvine.oeis.a107;

import irvine.oeis.FiniteSequence;

/**
 * A107339 Longest sequence of n-digit n-almost primes formed by beginning with a single-digit prime and appending a single decimal digit to each previous term.
 * @author Georg Fischer
 */
public class A107339 extends FiniteSequence {

  /** Construct the sequence. */
  public A107339() {
    super(1, FINITE, 5, 57, 574, 5748, 57486, 574868, 5748688, 57486888);
  }
}

package irvine.oeis.a237;

import irvine.oeis.FiniteSequence;

/**
 * A237051 Smallest set of distinct numbers with property that the sum of their reciprocals is 1 and each number is of the form <code>p^i*q^j</code> where p and q are distinct primes and i and j are positive.
 * @author Georg Fischer
 */
public class A237051 extends FiniteSequence {

  /** Construct the sequence. */
  public A237051() {
    super(6, 10, 12, 14, 15, 18, 20, 21, 22, 24, 26, 28, 33, 35, 36, 39, 40, 44, 52, 55);
  }
}

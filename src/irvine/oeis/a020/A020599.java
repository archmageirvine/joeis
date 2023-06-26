package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020599 Smallest nonempty set S containing prime divisors of 5k+7 for each k in S.
 * @author Georg Fischer
 */
public class A020599 extends FiniteSequence {

  /** Construct the sequence. */
  public A020599() {
    super(1, FINITE, 2, 3, 11, 13, 17, 23, 31, 61);
  }
}

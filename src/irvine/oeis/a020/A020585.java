package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020585 Smallest nonempty set S containing prime divisors of 3k+7 for each k in S.
 * @author Georg Fischer
 */
public class A020585 extends FiniteSequence {

  /** Construct the sequence. */
  public A020585() {
    super(1, FINITE, 2, 13, 19, 23);
  }
}

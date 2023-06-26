package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020583 Smallest nonempty set S containing prime divisors of 3k+5 for each k in S.
 * @author Georg Fischer
 */
public class A020583 extends FiniteSequence {

  /** Construct the sequence. */
  public A020583() {
    super(1, FINITE, 2, 7, 11, 13, 19, 31);
  }
}

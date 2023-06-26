package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020588 Smallest nonempty set S containing prime divisors of 4k+2 for each k in S.
 * @author Georg Fischer
 */
public class A020588 extends FiniteSequence {

  /** Construct the sequence. */
  public A020588() {
    super(1, FINITE, 2, 3, 5, 7, 11, 13, 19, 23, 47);
  }
}

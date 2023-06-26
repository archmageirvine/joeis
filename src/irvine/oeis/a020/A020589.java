package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020589 Smallest nonempty set S containing prime divisors of 4k+3 for each k in S.
 * @author Georg Fischer
 */
public class A020589 extends FiniteSequence {

  /** Construct the sequence. */
  public A020589() {
    super(1, FINITE, 5, 7, 11, 13, 17, 19, 23, 29, 31, 41, 47, 59, 61, 71, 73, 79, 127, 137, 167, 191, 239);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020614 Smallest nonempty set S containing prime divisors of 7k+10 for each k in S.
 * @author Georg Fischer
 */
public class A020614 extends FiniteSequence {

  /** Construct the sequence. */
  public A020614() {
    super(1, FINITE, 3, 11, 13, 17, 29, 31, 41, 43, 71, 101, 227, 239, 311);
  }
}

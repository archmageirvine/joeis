package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020608 Smallest nonempty set S containing prime divisors of 7k+3 for each k in S.
 * @author Georg Fischer
 */
public class A020608 extends FiniteSequence {

  /** Construct the sequence. */
  public A020608() {
    super(1, FINITE, 2, 5, 17, 19, 43, 61);
  }
}

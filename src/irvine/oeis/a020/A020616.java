package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020616 Smallest nonempty set S containing prime divisors of 8k+2 for each k in S.
 * @author Georg Fischer
 */
public class A020616 extends FiniteSequence {

  /** Construct the sequence. */
  public A020616() {
    super(1, FINITE, 2, 3, 5, 7, 11, 13, 19, 29, 53, 71);
  }
}

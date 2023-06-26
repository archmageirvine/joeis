package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020598 Smallest nonempty set S containing prime divisors of 5k+4 for each k in S.
 * @author Georg Fischer
 */
public class A020598 extends FiniteSequence {

  /** Construct the sequence. */
  public A020598() {
    super(1, FINITE, 3, 7, 11, 13, 17, 19, 23, 59, 79, 89, 173, 449);
  }
}

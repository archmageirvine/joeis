package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020636 Smallest nonempty set S containing prime divisors of 10k+8 for each k in S.
 * @author Georg Fischer
 */
public class A020636 extends FiniteSequence {

  /** Construct the sequence. */
  public A020636() {
    super(1, FINITE, 2, 3, 7, 11, 13, 17, 19, 23, 59, 79, 89, 173, 449);
  }
}

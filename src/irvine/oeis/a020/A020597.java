package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020597 Smallest nonempty set S containing prime divisors of 5k+3 for each k in S.
 * @author Georg Fischer
 */
public class A020597 extends FiniteSequence {

  /** Construct the sequence. */
  public A020597() {
    super(2, 7, 11, 13, 17, 19, 29, 37, 47);
  }
}

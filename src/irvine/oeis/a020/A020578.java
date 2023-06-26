package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020578 Smallest nonempty set S containing prime divisors of 2k+7 for each k in S.
 * @author Georg Fischer
 */
public class A020578 extends FiniteSequence {

  /** Construct the sequence. */
  public A020578() {
    super(1, FINITE, 3, 5, 11, 13, 17, 29, 37, 41, 89);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020575 Smallest nonempty set S containing prime divisors of 2k + 1 for each k in S.
 * @author Georg Fischer
 */
public class A020575 extends FiniteSequence {

  /** Construct the sequence. */
  public A020575() {
    super(1, FINITE, 3, 5, 7, 11, 13, 19, 23, 47);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020625 Smallest nonempty set S containing prime divisors of 9k+3 for each k in S.
 * @author Georg Fischer
 */
public class A020625 extends FiniteSequence {

  /** Construct the sequence. */
  public A020625() {
    super(2, 3, 5, 7, 11, 13, 17);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020587 Smallest nonempty set S containing prime divisors of 4k+1 for each k in S.
 * @author Georg Fischer
 */
public class A020587 extends FiniteSequence {

  /** Construct the sequence. */
  public A020587() {
    super(3, 5, 7, 11, 13, 19, 29, 53, 71);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020591 Smallest nonempty set S containing prime divisors of 4k+6 for each k in S.
 * @author Georg Fischer
 */
public class A020591 extends FiniteSequence {

  /** Construct the sequence. */
  public A020591() {
    super(2, 5, 7, 11, 13, 17, 29, 37, 61);
  }
}

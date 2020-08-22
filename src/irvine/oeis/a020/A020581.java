package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020581 Smallest nonempty set S containing prime divisors of 3k+1 for each k in S.
 * @author Georg Fischer
 */
public class A020581 extends FiniteSequence {

  /** Construct the sequence. */
  public A020581() {
    super(2, 5, 7, 11, 13, 17);
  }
}

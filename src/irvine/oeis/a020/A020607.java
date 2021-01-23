package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020607 Smallest nonempty set S containing prime divisors of 7k + 1 for each k in S.
 * @author Georg Fischer
 */
public class A020607 extends FiniteSequence {

  /** Construct the sequence. */
  public A020607() {
    super(2, 3, 5, 11, 13, 23);
  }
}

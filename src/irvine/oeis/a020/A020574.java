package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020574 Smallest nonempty set S containing prime divisors of k + 10 for each k in S.
 * @author Georg Fischer
 */
public class A020574 extends FiniteSequence {

  /** Construct the sequence. */
  public A020574() {
    super(3, 7, 11, 13, 17, 23);
  }
}

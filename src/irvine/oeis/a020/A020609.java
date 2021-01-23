package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020609 Smallest nonempty set S containing prime divisors of 7k+4 for each k in S.
 * @author Georg Fischer
 */
public class A020609 extends FiniteSequence {

  /** Construct the sequence. */
  public A020609() {
    super(3, 5, 11, 13, 19, 23, 107, 137, 251, 457, 587, 3203);
  }
}

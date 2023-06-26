package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020610 Smallest nonempty set S containing prime divisors of 7k+5 for each k in S.
 * @author Georg Fischer
 */
public class A020610 extends FiniteSequence {

  /** Construct the sequence. */
  public A020610() {
    super(1, FINITE, 2, 3, 11, 13, 17, 19, 23, 31, 37, 41, 43, 73, 83, 257, 293);
  }
}

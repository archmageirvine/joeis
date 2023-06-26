package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020586 Smallest nonempty set S containing prime divisors of 3k+8 for each k in S.
 * @author Georg Fischer
 */
public class A020586 extends FiniteSequence {

  /** Construct the sequence. */
  public A020586() {
    super(1, FINITE, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 59, 101, 131, 149, 173, 311, 401, 941);
  }
}

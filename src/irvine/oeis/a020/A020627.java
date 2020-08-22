package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020627 Smallest nonempty set S containing prime divisors of 9k+5 for each k in S.
 * @author Georg Fischer
 */
public class A020627 extends FiniteSequence {

  /** Construct the sequence. */
  public A020627() {
    super(2, 7, 11, 13, 17, 19, 23, 29, 43, 53, 59, 61, 67, 71, 79, 101, 179, 241, 277, 367, 457, 827, 1087, 1249, 1549, 2447, 5507, 5623, 12653, 56941);
  }
}

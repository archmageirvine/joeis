package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020632 Smallest nonempty set S containing prime divisors of 10k+1 for each k in S.
 * @author Georg Fischer
 */
public class A020632 extends FiniteSequence {

  /** Construct the sequence. */
  public A020632() {
    super(1, FINITE, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 43, 47, 53, 59, 61, 71, 73, 79, 83, 97, 107, 113, 131, 139, 157, 163, 191, 197, 233, 277, 311, 383, 431, 479, 971, 1277, 1571, 1597, 5237, 15971);
  }
}

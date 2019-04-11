package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020600 Smallest nonempty set S containing prime divisors of <code>5k+8</code> for each k in S.
 * @author Georg Fischer
 */
public class A020600 extends FiniteSequence {

  /** Construct the sequence. */
  public A020600() {
    super(3, 7, 11, 13, 17, 19, 23, 31, 41, 43, 61, 67, 71, 73, 103, 163, 223, 311, 313, 373, 521, 523, 823, 1123, 1873, 5623, 20089, 28123);
  }
}

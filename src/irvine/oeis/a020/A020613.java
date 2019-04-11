package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020613 Smallest nonempty set S containing prime divisors of <code>7k+9</code> for each k in S.
 * @author Georg Fischer
 */
public class A020613 extends FiniteSequence {

  /** Construct the sequence. */
  public A020613() {
    super(2, 5, 11, 17, 23, 31, 43, 113);
  }
}

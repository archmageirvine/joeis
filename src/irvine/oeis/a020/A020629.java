package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020629 Smallest nonempty set S containing prime divisors of 9k+7 for each k in S.
 * @author Georg Fischer
 */
public class A020629 extends FiniteSequence {

  /** Construct the sequence. */
  public A020629() {
    super(2, 5, 11, 13, 31, 53);
  }
}

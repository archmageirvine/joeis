package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020628 Smallest nonempty set S containing prime divisors of <code>9k+6</code> for each k in S.
 * @author Georg Fischer
 */
public class A020628 extends FiniteSequence {

  /** Construct the sequence. */
  public A020628() {
    super(3, 5, 7, 11, 13, 17, 23, 41, 43, 53, 71, 79, 83, 127, 131, 151, 239, 251, 383, 691, 719, 1151);
  }
}

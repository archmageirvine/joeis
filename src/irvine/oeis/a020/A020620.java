package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020620 Smallest nonempty set S containing prime divisors of <code>8k+7</code> for each k in S.
 * @author Georg Fischer
 */
public class A020620 extends FiniteSequence {

  /** Construct the sequence. */
  public A020620() {
    super(3, 5, 11, 13, 17, 19, 23, 29, 31, 37, 41, 47, 53, 61, 67, 71, 83, 97, 101, 109, 163, 181, 191, 239, 263, 293, 307, 383, 431, 691, 821, 2111, 2351);
  }
}

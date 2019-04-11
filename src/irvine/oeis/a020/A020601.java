package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020601 Smallest nonempty set S containing prime divisors of <code>5k+9</code> for each k in S.
 * @author Georg Fischer
 */
public class A020601 extends FiniteSequence {

  /** Construct the sequence. */
  public A020601() {
    super(2, 13, 19, 37, 97);
  }
}

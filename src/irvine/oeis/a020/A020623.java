package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020623 Smallest nonempty set S containing prime divisors of <code>9k+1</code> for each k in S.
 * @author Georg Fischer
 */
public class A020623 extends FiniteSequence {

  /** Construct the sequence. */
  public A020623() {
    super(2, 7, 13, 19, 23, 43, 59, 97);
  }
}

package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020605 Smallest nonempty set S containing prime divisors of <code>6k+8</code> for each k in S.
 * @author Georg Fischer
 */
public class A020605 extends FiniteSequence {

  /** Construct the sequence. */
  public A020605() {
    super(2, 5, 7, 11, 17, 19, 23, 37, 61, 73, 223, 673);
  }
}

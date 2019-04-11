package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020582 Smallest nonempty set S containing prime divisors of <code>3k+4</code> for each k in S.
 * @author Georg Fischer
 */
public class A020582 extends FiniteSequence {

  /** Construct the sequence. */
  public A020582() {
    super(5, 7, 11, 17, 19, 23, 37, 61, 73, 223, 673);
  }
}

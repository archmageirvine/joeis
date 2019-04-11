package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020590 Smallest nonempty set S containing prime divisors of <code>4k+5</code> for each k in S.
 * @author Georg Fischer
 */
public class A020590 extends FiniteSequence {

  /** Construct the sequence. */
  public A020590() {
    super(3, 7, 11, 17, 73);
  }
}

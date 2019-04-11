package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020622 Smallest nonempty set S containing prime divisors of <code>8k+10</code> for each k in S.
 * @author Georg Fischer
 */
public class A020622 extends FiniteSequence {

  /** Construct the sequence. */
  public A020622() {
    super(2, 3, 7, 11, 13, 17, 19, 73);
  }
}

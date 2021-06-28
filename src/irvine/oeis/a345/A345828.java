package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345828 Numbers that are the sum of seven fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345828 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345828() {
    super(4, 7, 6, true, false);
  }
}

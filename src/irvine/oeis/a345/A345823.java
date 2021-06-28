package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345823 Numbers that are the sum of seven fourth powers in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345823 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345823() {
    super(4, 7, 1, true, false);
  }
}

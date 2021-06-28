package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345813 Numbers that are the sum of six fourth powers in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345813 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345813() {
    super(4, 6, 1, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345814 Numbers that are the sum of six fourth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345814 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345814() {
    super(4, 6, 2, true, false);
  }
}

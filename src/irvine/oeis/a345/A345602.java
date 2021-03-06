package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345602 Numbers that are the sum of ten fourth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A345602 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345602() {
    super(4, 10, 9);
  }
}

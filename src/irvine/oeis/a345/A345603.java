package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345603 Numbers that are the sum of ten fourth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345603 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345603() {
    super(4, 10, 10);
  }
}

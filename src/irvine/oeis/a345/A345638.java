package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345638 Numbers that are the sum of ten fifth powers in six or more ways.
 * @author Sean A. Irvine
 */
public class A345638 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345638() {
    super(5, 10, 6);
  }
}

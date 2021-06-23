package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345640 Numbers that are the sum of ten fifth powers in eight or more ways.
 * @author Sean A. Irvine
 */
public class A345640 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345640() {
    super(5, 10, 8);
  }
}

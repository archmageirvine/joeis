package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345864 Numbers that are the sum of five fifth powers in six or more ways.
 * @author Sean A. Irvine
 */
public class A345864 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345864() {
    super(5, 5, 6);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345599 Numbers that are the sum of ten fourth powers in six or more ways.
 * @author Sean A. Irvine
 */
public class A345599 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345599() {
    super(4, 10, 6);
  }
}

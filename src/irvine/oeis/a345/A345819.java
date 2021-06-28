package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345819 Numbers that are the sum of six fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345819 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345819() {
    super(4, 6, 7, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345789 Numbers that are the sum of eight cubes in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345789 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345789() {
    super(3, 8, 7, true, false);
  }
}

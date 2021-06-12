package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345151 Numbers that are the sum of four third powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345151 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345151() {
    super(3, 4, 7, true, false);
  }
}

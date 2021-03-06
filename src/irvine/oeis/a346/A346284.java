package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346284 Numbers that are the sum of seven fifth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A346284 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346284() {
    super(5, 7, 7, true, false);
  }
}

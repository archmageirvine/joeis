package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344730 Numbers that are the sum of three fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A344730 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344730() {
    super(4, 3, 7, true, false);
  }
}

package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344923 Numbers that are the sum of four fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A344923 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344923() {
    super(4, 4, 7, true, false);
  }
}

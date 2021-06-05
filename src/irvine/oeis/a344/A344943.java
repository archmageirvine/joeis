package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344943 Numbers that are the sum of five fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A344943 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344943() {
    super(4, 5, 7, true, false);
  }
}

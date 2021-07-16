package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346362 Numbers that are the sum of six fifth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A346362 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346362() {
    super(5, 6, 7, true, false);
  }
}

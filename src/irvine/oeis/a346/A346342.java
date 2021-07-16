package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346342 Numbers that are the sum of nine fifth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A346342 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346342() {
    super(5, 9, 7, true, false);
  }
}

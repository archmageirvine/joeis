package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346332 Numbers that are the sum of eight fifth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A346332 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346332() {
    super(5, 8, 7, true, false);
  }
}

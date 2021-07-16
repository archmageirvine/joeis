package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346352 Numbers that are the sum of ten fifth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A346352 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346352() {
    super(5, 10, 7, true, false);
  }
}

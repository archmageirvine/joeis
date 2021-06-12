package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345181 Numbers that are the sum of five third powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345181 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345181() {
    super(3, 5, 7, true, false);
  }
}

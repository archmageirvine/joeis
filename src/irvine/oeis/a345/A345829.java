package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345829 Numbers that are the sum of seven fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345829 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345829() {
    super(4, 7, 7, true, false);
  }
}

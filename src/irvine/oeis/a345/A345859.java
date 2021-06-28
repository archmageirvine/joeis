package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345859 Numbers that are the sum of ten fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345859 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345859() {
    super(4, 10, 7, true, false);
  }
}

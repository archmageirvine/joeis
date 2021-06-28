package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345849 Numbers that are the sum of nine fourth powers in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345849 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345849() {
    super(4, 9, 7, true, false);
  }
}

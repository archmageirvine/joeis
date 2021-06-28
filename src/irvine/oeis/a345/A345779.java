package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345779 Numbers that are the sum of seven cubes in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345779 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345779() {
    super(3, 7, 7, true, false);
  }
}

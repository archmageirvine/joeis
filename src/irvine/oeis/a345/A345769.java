package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345769 Numbers that are the sum of six cubes in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345769 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345769() {
    super(3, 6, 7, true, false);
  }
}

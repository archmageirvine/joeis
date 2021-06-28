package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345799 Numbers that are the sum of nine cubes in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345799 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345799() {
    super(3, 9, 7, true, false);
  }
}

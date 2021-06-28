package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345809 Numbers that are the sum of ten cubes in exactly seven ways.
 * @author Sean A. Irvine
 */
public class A345809 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345809() {
    super(3, 10, 7, true, false);
  }
}

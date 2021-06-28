package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345803 Numbers that are the sum of ten cubes in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345803 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345803() {
    super(3, 10, 1, true, false);
  }
}

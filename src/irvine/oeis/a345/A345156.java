package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345156 Numbers that are the sum of four third powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345156 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345156() {
    super(3, 4, 10, true, false);
  }
}

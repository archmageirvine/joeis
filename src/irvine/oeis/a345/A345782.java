package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345782 Numbers that are the sum of seven cubes in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345782 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345782() {
    super(3, 7, 10, true, false);
  }
}

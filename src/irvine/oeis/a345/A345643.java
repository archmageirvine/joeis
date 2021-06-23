package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345643 Numbers that are the sum of seven fifth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345643 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345643() {
    super(5, 7, 10);
  }
}

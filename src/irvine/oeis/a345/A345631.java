package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345631 Numbers that are the sum of seven fifth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A345631 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345631() {
    super(5, 7, 9);
  }
}

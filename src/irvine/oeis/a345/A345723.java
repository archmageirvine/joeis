package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345723 Numbers that are the sum of six fifth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A345723 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345723() {
    super(5, 6, 9);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345641 Numbers that are the sum of ten fifth powers in nine or more ways.
 * @author Sean A. Irvine
 */
public class A345641 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345641() {
    super(5, 10, 9);
  }
}

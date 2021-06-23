package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345635 Numbers that are the sum of ten fifth powers in three or more ways.
 * @author Sean A. Irvine
 */
public class A345635 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345635() {
    super(5, 10, 3);
  }
}

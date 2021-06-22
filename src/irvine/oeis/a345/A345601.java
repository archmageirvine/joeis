package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345601 Numbers that are the sum of ten fourth powers in eight or more ways.
 * @author Sean A. Irvine
 */
public class A345601 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345601() {
    super(4, 10, 8);
  }
}

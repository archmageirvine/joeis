package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345600 Numbers that are the sum of ten fourth powers in seven or more ways.
 * @author Sean A. Irvine
 */
public class A345600 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345600() {
    super(4, 10, 7);
  }
}

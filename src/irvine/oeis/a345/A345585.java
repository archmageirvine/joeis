package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345585 Numbers that are the sum of eight fourth powers in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345585 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345585() {
    super(4, 8, 10);
  }
}

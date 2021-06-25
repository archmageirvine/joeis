package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345623 Numbers that are the sum of nine fifth powers in six or more ways.
 * @author Sean A. Irvine
 */
public class A345623 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345623() {
    super(5, 9, 6);
  }
}

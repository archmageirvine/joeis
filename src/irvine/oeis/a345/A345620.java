package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345620 Numbers that are the sum of nine fifth powers in three or more ways.
 * @author Sean A. Irvine
 */
public class A345620 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345620() {
    super(5, 9, 3);
  }
}

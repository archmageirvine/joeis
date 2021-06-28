package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345815 Numbers that are the sum of six fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345815 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345815() {
    super(4, 6, 3, true, false);
  }
}

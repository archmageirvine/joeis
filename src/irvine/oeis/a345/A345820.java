package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345820 Numbers that are the sum of six fourth powers in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345820 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345820() {
    super(4, 6, 8, true, false);
  }
}

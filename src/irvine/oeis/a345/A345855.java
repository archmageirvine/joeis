package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345855 Numbers that are the sum of ten fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345855 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345855() {
    super(4, 10, 3, true, false);
  }
}

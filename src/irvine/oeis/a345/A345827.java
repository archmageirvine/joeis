package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345827 Numbers that are the sum of seven fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345827 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345827() {
    super(4, 7, 5, true, false);
  }
}

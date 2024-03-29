package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345084 Numbers that are the sum of three third powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345084 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345084() {
    super(3, 3, 6, true, false);
  }
}

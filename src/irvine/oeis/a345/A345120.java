package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345120 Numbers that are the sum of three third powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345120 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345120() {
    super(3, 3, 9, true, false);
  }
}

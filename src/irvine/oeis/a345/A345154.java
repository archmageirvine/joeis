package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345154 Numbers that are the sum of four third powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345154 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345154() {
    super(3, 4, 9, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345861 Numbers that are the sum of ten fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345861 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345861() {
    super(4, 10, 9, true, false);
  }
}

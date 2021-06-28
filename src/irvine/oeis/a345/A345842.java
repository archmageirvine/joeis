package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345842 Numbers that are the sum of eight fourth powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345842 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345842() {
    super(4, 8, 10, true, false);
  }
}

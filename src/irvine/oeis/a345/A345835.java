package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345835 Numbers that are the sum of eight fourth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345835 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345835() {
    super(4, 8, 3, true, false);
  }
}

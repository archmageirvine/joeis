package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345816 Numbers that are the sum of six fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345816 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345816() {
    super(4, 6, 4, true, false);
  }
}

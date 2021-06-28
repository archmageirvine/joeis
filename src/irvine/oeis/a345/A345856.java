package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345856 Numbers that are the sum of ten fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345856 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345856() {
    super(4, 10, 4, true, false);
  }
}

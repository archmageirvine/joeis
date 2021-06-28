package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345836 Numbers that are the sum of eight fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345836 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345836() {
    super(4, 8, 4, true, false);
  }
}

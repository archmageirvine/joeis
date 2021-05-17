package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344278 Numbers that are the sum of three fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A344278 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344278() {
    super(4, 3, 4, true, false);
  }
}

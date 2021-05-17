package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344353 Numbers that are the sum of four fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A344353 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344353() {
    super(4, 4, 4, true, false);
  }
}

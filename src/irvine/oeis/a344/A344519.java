package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344519 Numbers that are the sum of five fifth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A344519 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344519() {
    super(5, 5, 4, true, false);
  }
}

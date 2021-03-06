package irvine.oeis.a344;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A344355 Numbers that are the sum of five fourth powers in exactly four ways.
 * @author Sean A. Irvine
 */
public class A344355 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A344355() {
    super(4, 5, 4, true, false);
  }
}

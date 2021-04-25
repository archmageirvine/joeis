package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025358 Numbers that are the sum of 4 nonzero squares in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A025358 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025358() {
    super(2, 4, 2, true, false);
  }
}

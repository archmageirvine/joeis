package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025289 Numbers that are the sum of 2 nonzero squares in exactly 6 ways.
 * @author Sean A. Irvine
 */
public class A025289 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025289() {
    super(2, 2, 6, true, false);
  }
}

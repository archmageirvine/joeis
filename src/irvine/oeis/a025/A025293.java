package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025293 Numbers that are the sum of 2 nonzero squares in exactly 10 ways.
 * @author Sean A. Irvine
 */
public class A025293 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025293() {
    super(2, 2, 10, true, false);
  }
}

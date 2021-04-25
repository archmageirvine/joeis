package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025286 Numbers that are the sum of 2 nonzero squares in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A025286 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025286() {
    super(2, 2, 3, true, false);
  }
}

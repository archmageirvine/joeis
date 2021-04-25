package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025364 Numbers that are the sum of 4 nonzero squares in exactly 8 ways.
 * @author Sean A. Irvine
 */
public class A025364 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025364() {
    super(2, 4, 8, true, false);
  }
}

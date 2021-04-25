package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025366 Numbers that are the sum of 4 nonzero squares in exactly 10 ways.
 * @author Sean A. Irvine
 */
public class A025366 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025366() {
    super(2, 4, 10, true, false);
  }
}

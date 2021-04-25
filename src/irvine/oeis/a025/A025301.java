package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025301 Numbers that are the sum of 2 nonzero squares in 10 or more ways.
 * @author Sean A. Irvine
 */
public class A025301 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025301() {
    super(2, 2, 10);
  }
}

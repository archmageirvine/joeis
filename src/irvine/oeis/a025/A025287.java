package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025287 Numbers that are the sum of 2 nonzero squares in exactly 4 ways.
 * @author Sean A. Irvine
 */
public class A025287 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025287() {
    super(2, 2, 4, true, false);
  }
}

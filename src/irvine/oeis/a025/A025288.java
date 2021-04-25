package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025288 Numbers that are the sum of 2 nonzero squares in exactly 5 ways.
 * @author Sean A. Irvine
 */
public class A025288 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025288() {
    super(2, 2, 5, true, false);
  }
}

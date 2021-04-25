package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025359 Numbers that are the sum of 4 nonzero squares in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A025359 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025359() {
    super(2, 4, 3, true, false);
  }
}

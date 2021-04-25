package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025365 Numbers that are the sum of 4 nonzero squares in exactly 9 ways.
 * @author Sean A. Irvine
 */
public class A025365 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025365() {
    super(2, 4, 9, true, false);
  }
}

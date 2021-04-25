package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025357 Numbers that are the sum of 4 nonzero squares in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025357 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025357() {
    super(2, 4, 1, true, false);
  }
}

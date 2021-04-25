package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025330 Numbers that are the sum of 3 nonzero squares in exactly 10 ways.
 * @author Sean A. Irvine
 */
public class A025330 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025330() {
    super(2, 3, 10, true, false);
  }
}

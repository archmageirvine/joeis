package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025361 Numbers that are the sum of 4 nonzero squares in exactly 5 ways.
 * @author Sean A. Irvine
 */
public class A025361 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025361() {
    super(2, 4, 5, true, false);
  }
}

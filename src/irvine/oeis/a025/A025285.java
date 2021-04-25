package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025285 Numbers that are the sum of 2 nonzero squares in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A025285 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025285() {
    super(2, 2, 2, true, false);
  }
}

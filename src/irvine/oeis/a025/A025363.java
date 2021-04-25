package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025363 Numbers that are the sum of 4 nonzero squares in exactly 7 ways.
 * @author Sean A. Irvine
 */
public class A025363 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025363() {
    super(2, 4, 7, true, false);
  }
}

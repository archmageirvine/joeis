package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025284 Numbers that are the sum of 2 nonzero squares in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025284 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025284() {
    super(2, 2, 1, true, false);
  }
}

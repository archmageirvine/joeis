package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025327 Numbers that are the sum of 3 nonzero squares in exactly 7 ways.
 * @author Sean A. Irvine
 */
public class A025327 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025327() {
    super(2, 3, 7, true, false);
  }
}

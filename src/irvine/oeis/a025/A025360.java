package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025360 Numbers that are the sum of 4 nonzero squares in exactly 4 ways.
 * @author Sean A. Irvine
 */
public class A025360 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025360() {
    super(2, 4, 4, true, false);
  }
}

package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025290 Numbers that are the sum of 2 nonzero squares in exactly 7 ways.
 * @author Sean A. Irvine
 */
public class A025290 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025290() {
    super(2, 2, 7, true, false);
  }
}

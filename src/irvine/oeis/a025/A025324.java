package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025324 Numbers that are the sum of 3 nonzero squares in exactly 4 ways.
 * @author Sean A. Irvine
 */
public class A025324 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025324() {
    super(2, 3, 4, true, false);
  }
}

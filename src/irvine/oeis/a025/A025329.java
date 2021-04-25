package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025329 Numbers that are the sum of 3 nonzero squares in exactly 9 ways.
 * @author Sean A. Irvine
 */
public class A025329 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025329() {
    super(2, 3, 9, true, false);
  }
}

package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025292 Numbers that are the sum of 2 nonzero squares in exactly 9 ways.
 * @author Sean A. Irvine
 */
public class A025292 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025292() {
    super(2, 2, 9, true, false);
  }
}

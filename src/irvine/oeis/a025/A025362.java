package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025362 Numbers that are the sum of 4 nonzero squares in exactly 6 ways.
 * @author Sean A. Irvine
 */
public class A025362 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025362() {
    super(2, 4, 6, true, false);
  }
}

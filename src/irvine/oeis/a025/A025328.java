package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025328 Numbers that are the sum of 3 nonzero squares in exactly 8 ways.
 * @author Sean A. Irvine
 */
public class A025328 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025328() {
    super(2, 3, 8, true, false);
  }
}

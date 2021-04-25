package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025322 Numbers that are the sum of 3 nonzero squares in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A025322 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025322() {
    super(2, 3, 2, true, false);
  }
}

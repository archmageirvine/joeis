package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025323 Numbers that are the sum of 3 nonzero squares in exactly 3 ways.
 * @author Sean A. Irvine
 */
public class A025323 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025323() {
    super(2, 3, 3, true, false);
  }
}

package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025291 Numbers that are the sum of 2 nonzero squares in exactly 8 ways.
 * @author Sean A. Irvine
 */
public class A025291 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025291() {
    super(2, 2, 8, true, false);
  }
}

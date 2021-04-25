package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025321 Numbers that are the sum of 3 nonzero squares in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025321 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025321() {
    super(2, 3, 1, true, false);
  }
}

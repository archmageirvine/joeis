package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025395 Numbers that are the sum of 3 positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025395 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025395() {
    super(3, 3, 1, true, false);
  }
}

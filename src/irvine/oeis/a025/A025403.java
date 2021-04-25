package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025403 Numbers that are the sum of 4 positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A025403 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025403() {
    super(3, 4, 1, true, false);
  }
}

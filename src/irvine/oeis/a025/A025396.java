package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025396 Numbers that are the sum of 3 positive cubes in exactly 2 ways.
 * @author Sean A. Irvine
 */
public class A025396 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025396() {
    super(3, 3, 2, true, false);
  }
}

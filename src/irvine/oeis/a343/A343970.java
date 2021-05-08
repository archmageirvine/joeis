package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343970 Numbers that are the sum of three positive cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A343970 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343970() {
    super(3, 3, 5, true, false);
  }
}

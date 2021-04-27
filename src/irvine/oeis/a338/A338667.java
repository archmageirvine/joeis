package irvine.oeis.a338;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A338667 Numbers that are the sum of two positive cubes in exactly one way.
 * @author Sean A. Irvine
 */
public class A338667 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A338667() {
    super(3, 2, 1, true, false);
  }
}

package irvine.oeis.a343;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A343969 Numbers that are the sum of three positive cubes in exactly 4 ways.
 * @author Sean A. Irvine
 */
public class A343969 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A343969() {
    super(3, 3, 4, true, false);
  }
}

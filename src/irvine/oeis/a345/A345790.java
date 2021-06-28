package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345790 Numbers that are the sum of eight cubes in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345790 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345790() {
    super(3, 8, 8, true, false);
  }
}

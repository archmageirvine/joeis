package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345783 Numbers that are the sum of eight cubes in exactly one way.
 * @author Sean A. Irvine
 */
public class A345783 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345783() {
    super(3, 8, 1, true, false);
  }
}

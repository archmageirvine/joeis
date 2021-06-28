package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345784 Numbers that are the sum of eight cubes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345784 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345784() {
    super(3, 8, 2, true, false);
  }
}

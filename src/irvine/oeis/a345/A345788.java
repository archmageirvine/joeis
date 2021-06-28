package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345788 Numbers that are the sum of eight cubes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345788 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345788() {
    super(3, 8, 6, true, false);
  }
}

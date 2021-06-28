package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345785 Numbers that are the sum of eight cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345785 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345785() {
    super(3, 8, 3, true, false);
  }
}

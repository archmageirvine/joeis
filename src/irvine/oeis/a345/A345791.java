package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345791 Numbers that are the sum of eight cubes in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345791 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345791() {
    super(3, 8, 9, true, false);
  }
}

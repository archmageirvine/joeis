package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345786 Numbers that are the sum of eight cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345786 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345786() {
    super(3, 8, 4, true, false);
  }
}

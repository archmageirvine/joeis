package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345865 Numbers that are the sum of two cubes in exactly four ways.
 * @author Sean A. Irvine
 */
public class A345865 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345865() {
    super(3, 2, 4, true, false);
  }
}

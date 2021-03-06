package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345794 Numbers that are the sum of nine cubes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345794 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345794() {
    super(3, 9, 2, true, false);
  }
}

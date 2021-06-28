package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345795 Numbers that are the sum of nine cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345795 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345795() {
    super(3, 9, 3, true, false);
  }
}

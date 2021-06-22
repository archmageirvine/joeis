package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345549 Numbers that are the sum of nine cubes in ten or more ways.
 * @author Sean A. Irvine
 */
public class A345549 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345549() {
    super(3, 9, 10);
  }
}

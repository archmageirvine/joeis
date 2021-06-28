package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345801 Numbers that are the sum of nine cubes in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345801 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345801() {
    super(3, 9, 9, true, false);
  }
}

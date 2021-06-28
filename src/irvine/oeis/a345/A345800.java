package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345800 Numbers that are the sum of nine cubes in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345800 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345800() {
    super(3, 9, 8, true, false);
  }
}

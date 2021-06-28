package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345805 Numbers that are the sum of ten cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345805 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345805() {
    super(3, 10, 3, true, false);
  }
}

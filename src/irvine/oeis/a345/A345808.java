package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345808 Numbers that are the sum of ten cubes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345808 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345808() {
    super(3, 10, 6, true, false);
  }
}

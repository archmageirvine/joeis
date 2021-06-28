package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345812 Numbers that are the sum of ten cubes in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345812 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345812() {
    super(3, 10, 10, true, false);
  }
}

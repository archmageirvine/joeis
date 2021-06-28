package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345778 Numbers that are the sum of seven cubes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345778 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345778() {
    super(3, 7, 6, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345777 Numbers that are the sum of seven cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345777 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345777() {
    super(3, 7, 5, true, false);
  }
}

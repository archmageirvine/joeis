package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345775 Numbers that are the sum of seven cubes in exactly three ways.
 * @author Sean A. Irvine
 */
public class A345775 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345775() {
    super(3, 7, 3, true, false);
  }
}

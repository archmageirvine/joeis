package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345774 Numbers that are the sum of seven cubes in exactly two ways.
 * @author Sean A. Irvine
 */
public class A345774 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345774() {
    super(3, 7, 2, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345780 Numbers that are the sum of seven cubes in exactly eight ways.
 * @author Sean A. Irvine
 */
public class A345780 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345780() {
    super(3, 7, 8, true, false);
  }
}

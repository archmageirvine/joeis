package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345781 Numbers that are the sum of seven cubes in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345781 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345781() {
    super(3, 7, 9, true, false);
  }
}

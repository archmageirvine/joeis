package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345807 Numbers that are the sum of ten cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345807 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345807() {
    super(3, 10, 5, true, false);
  }
}

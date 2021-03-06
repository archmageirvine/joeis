package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345797 Numbers that are the sum of nine cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345797 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345797() {
    super(3, 9, 5, true, false);
  }
}

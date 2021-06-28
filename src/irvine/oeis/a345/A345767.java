package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345767 Numbers that are the sum of six cubes in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345767 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345767() {
    super(3, 6, 5, true, false);
  }
}

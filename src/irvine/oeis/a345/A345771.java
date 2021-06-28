package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345771 Numbers that are the sum of six cubes in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345771 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345771() {
    super(3, 6, 9, true, false);
  }
}

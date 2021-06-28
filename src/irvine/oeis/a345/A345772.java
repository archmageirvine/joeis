package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345772 Numbers that are the sum of six cubes in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345772 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345772() {
    super(3, 6, 10, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345793 Numbers that are the sum of nine cubes in exactly one way.
 * @author Sean A. Irvine
 */
public class A345793 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345793() {
    super(3, 9, 1, true, false);
  }
}

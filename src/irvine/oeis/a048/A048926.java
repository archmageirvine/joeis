package irvine.oeis.a048;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A048926 Numbers that are the sum of 5 positive cubes in exactly 1 way.
 * @author Sean A. Irvine
 */
public class A048926 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A048926() {
    super(3, 5, 1, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345773 Numbers that are the sum of seven cubes in exactly one ways.
 * @author Sean A. Irvine
 */
public class A345773 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345773() {
    super(3, 7, 1, true, false);
  }
}

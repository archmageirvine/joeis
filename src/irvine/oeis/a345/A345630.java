package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345630 Numbers that are the sum of seven fifth powers in eight or more ways.
 * @author Sean A. Irvine
 */
public class A345630 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345630() {
    super(5, 7, 8);
  }
}

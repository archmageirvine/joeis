package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345609 Numbers that are the sum of seven fifth powers in six or more ways.
 * @author Sean A. Irvine
 */
public class A345609 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345609() {
    super(5, 7, 6);
  }
}

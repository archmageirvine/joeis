package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345122 Numbers that are the sum of three third powers in exactly ten ways.
 * @author Sean A. Irvine
 */
public class A345122 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345122() {
    super(3, 3, 10, true, false);
  }
}

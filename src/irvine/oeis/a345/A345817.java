package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345817 Numbers that are the sum of six fourth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A345817 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345817() {
    super(4, 6, 5, true, false);
  }
}

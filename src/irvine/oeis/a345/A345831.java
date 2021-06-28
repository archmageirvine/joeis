package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345831 Numbers that are the sum of seven fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345831 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345831() {
    super(4, 7, 9, true, false);
  }
}

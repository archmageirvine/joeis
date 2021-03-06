package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345186 Numbers that are the sum of five third powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345186 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345186() {
    super(3, 5, 9, true, false);
  }
}

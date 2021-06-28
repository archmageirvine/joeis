package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345821 Numbers that are the sum of six fourth powers in exactly nine ways.
 * @author Sean A. Irvine
 */
public class A345821 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345821() {
    super(4, 6, 9, true, false);
  }
}

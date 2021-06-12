package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345175 Numbers that are the sum of five third powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345175 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345175() {
    super(3, 5, 6, true, false);
  }
}

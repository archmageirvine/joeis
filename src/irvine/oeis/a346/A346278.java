package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346278 Numbers that are the sum of seven fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A346278 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346278() {
    super(5, 7, 1, true, false);
  }
}

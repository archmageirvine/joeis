package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346282 Numbers that are the sum of seven fifth powers in exactly five ways.
 * @author Sean A. Irvine
 */
public class A346282 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346282() {
    super(5, 7, 5, true, false);
  }
}

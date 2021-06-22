package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345606 Numbers that are the sum of seven fifth powers in three or more ways.
 * @author Sean A. Irvine
 */
public class A345606 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345606() {
    super(5, 7, 3);
  }
}

package irvine.oeis.a342;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A342687 Numbers that are the sum of five fifth powers in three or more ways.
 * @author Sean A. Irvine
 */
public class A342687 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A342687() {
    super(5, 5, 3);
  }
}

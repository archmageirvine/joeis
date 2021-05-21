package irvine.oeis.a342;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A342688 Numbers that are the sum of five fifth powers in exactly three ways.
 * @author Sean A. Irvine
 */
public class A342688 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A342688() {
    super(5, 5, 3, true, false);
  }
}

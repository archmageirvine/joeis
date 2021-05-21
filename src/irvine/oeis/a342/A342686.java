package irvine.oeis.a342;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A342686 Numbers that are the sum of five fifth powers in exactly two ways.
 * @author Sean A. Irvine
 */
public class A342686 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A342686() {
    super(5, 5, 2, true, false);
  }
}

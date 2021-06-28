package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345798 Numbers that are the sum of nine cubes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345798 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345798() {
    super(3, 9, 6, true, false);
  }
}

package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345552 Numbers that are the sum of ten cubes in four or more ways.
 * @author Sean A. Irvine
 */
public class A345552 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345552() {
    super(3, 10, 4);
  }
}

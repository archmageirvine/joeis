package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345768 Numbers that are the sum of six cubes in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345768 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345768() {
    super(3, 6, 6, true, false);
  }
}

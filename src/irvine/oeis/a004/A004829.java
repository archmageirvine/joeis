package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004829 Numbers that are the sum of at most 7 positive cubes.
 * @author Sean A. Irvine
 */
public class A004829 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004829() {
    super(3, 0, 7, false);
  }
}

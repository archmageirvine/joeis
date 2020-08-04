package irvine.oeis.a004;

import irvine.oeis.SumOfLikePowersSequence;

/**
 * A004828 Numbers that are the sum of at most 6 positive cubes.
 * @author Sean A. Irvine
 */
public class A004828 extends SumOfLikePowersSequence {

  /** Construct the sequence. */
  public A004828() {
    super(3, 0, 6, false);
  }
}

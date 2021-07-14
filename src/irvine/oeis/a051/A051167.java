package irvine.oeis.a051;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A051167 Sum of two positive cubes in at least five ways (all solutions).
 * @author Sean A. Irvine
 */
public class A051167 extends LimitedSumOfLikePowersSequence {

  // This is too slow to actually get any terms in reasonable time

  /** Construct the sequence. */
  public A051167() {
    super(3, 2, 5);
  }
}

package irvine.oeis.a346;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A346326 Numbers that are the sum of eight fifth powers in exactly one way.
 * @author Sean A. Irvine
 */
public class A346326 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A346326() {
    super(5, 8, 1, true, false);
  }
}

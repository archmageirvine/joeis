package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025326 Numbers that are the sum of 3 nonzero squares in exactly 6 ways.
 * @author Sean A. Irvine
 */
public class A025326 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025326() {
    super(2, 3, 6, true, false);
  }
}

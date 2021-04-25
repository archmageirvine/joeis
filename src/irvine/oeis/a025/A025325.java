package irvine.oeis.a025;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A025325 Numbers that are the sum of 3 nonzero squares in exactly 5 ways.
 * @author Sean A. Irvine
 */
public class A025325 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A025325() {
    super(2, 3, 5, true, false);
  }
}

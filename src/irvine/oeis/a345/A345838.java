package irvine.oeis.a345;

import irvine.oeis.LimitedSumOfLikePowersSequence;

/**
 * A345838 Numbers that are the sum of eight fourth powers in exactly six ways.
 * @author Sean A. Irvine
 */
public class A345838 extends LimitedSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345838() {
    super(4, 8, 6, true, false);
  }
}

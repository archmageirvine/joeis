package irvine.oeis.a345;

import irvine.oeis.DirectSumOfLikePowersSequence;

/**
 * A345505 Numbers that are the sum of nine squares in eight or more ways.
 * @author Sean A. Irvine
 */
public class A345505 extends DirectSumOfLikePowersSequence {

  /** Construct the sequence. */
  public A345505() {
    super(2, 9, 8);
  }
}

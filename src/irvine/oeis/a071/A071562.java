package irvine.oeis.a071;

import irvine.oeis.FilterPositionSequence;

/**
 * A071562 Numbers n such that the sum of the middle divisors of n (A071090) is not zero.
 * @author Sean A. Irvine
 */
public class A071562 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A071562() {
    super(1, 1, new A071090(), NONZERO);
  }
}

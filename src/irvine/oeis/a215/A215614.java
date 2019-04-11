package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215614 Numbers n that are not multiples of 10 such that sum of digits of <code>n^2</code> is 7.
 * @author Georg Fischer
 */
public class A215614 extends FiniteSequence {

  /** Construct the sequence. */
  public A215614() {
    super(4, 5, 32, 49, 149, 1049);
  }
}

package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215614 Numbers k that are not multiples of 10 and such that sum of digits of k^2 is 7.
 * @author Georg Fischer
 */
public class A215614 extends FiniteSequence {

  /** Construct the sequence. */
  public A215614() {
    super(1, FINITE, 4, 5, 32, 49, 149, 1049);
  }
}

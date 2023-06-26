package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215795 Numbers n such that 2^n-1 is a triangular number (A000217).
 * @author Georg Fischer
 */
public class A215795 extends FiniteSequence {

  /** Construct the sequence. */
  public A215795() {
    super(1, FINITE, 0, 1, 2, 4, 12);
  }
}

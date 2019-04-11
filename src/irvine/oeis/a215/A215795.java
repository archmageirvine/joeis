package irvine.oeis.a215;

import irvine.oeis.FiniteSequence;

/**
 * A215795 Numbers n such that <code>2^n-1</code> is a triangular number (A000217).
 * @author Georg Fischer
 */
public class A215795 extends FiniteSequence {

  /** Construct the sequence. */
  public A215795() {
    super(0, 1, 2, 4, 12);
  }
}

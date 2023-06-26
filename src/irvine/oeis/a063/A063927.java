package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063927 Number of vertices in the regular 4-dimensional polytopes.
 * @author Georg Fischer
 */
public class A063927 extends FiniteSequence {

  /** Construct the sequence. */
  public A063927() {
    super(1, FINITE, 5, 16, 8, 24, 600, 120);
  }
}

package irvine.oeis.a063;

import irvine.oeis.FiniteSequence;

/**
 * A063924 Number of 3-dimensional cells in the regular 4-dimensional polytopes.
 * @author Georg Fischer
 */
public class A063924 extends FiniteSequence {

  /** Construct the sequence. */
  public A063924() {
    super(1, FINITE, 5, 8, 16, 24, 120, 600);
  }
}

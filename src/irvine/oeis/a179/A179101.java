package irvine.oeis.a179;

import irvine.oeis.FiniteSequence;

/**
 * A179101 Numbers which are not the sum of exactly one positive square and a sum of squares-minus-1.
 * @author Georg Fischer
 */
public class A179101 extends FiniteSequence {

  /** Construct the sequence. */
  public A179101() {
    super(1, FINITE, 2, 3, 5, 6, 8, 11, 14);
  }
}

package irvine.oeis.a263;

import irvine.oeis.FiniteSequence;

/**
 * A263465 Values of D for which the imaginary quadratic field Q[ sqrt(-D) ] is norm-Euclidean.
 * @author Georg Fischer
 */
public class A263465 extends FiniteSequence {

  /** Construct the sequence. */
  public A263465() {
    super(1, FINITE, 1, 2, 3, 7, 11);
  }
}

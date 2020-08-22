package irvine.oeis.a162;

import irvine.oeis.FiniteSequence;

/**
 * A162500 Expansion of the polynomial (1-x^3) * (1-x^6) * (1-x^9) / (1-x)^3.
 * @author Georg Fischer
 */
public class A162500 extends FiniteSequence {

  /** Construct the sequence. */
  public A162500() {
    super(1, 3, 6, 9, 12, 15, 17, 18, 18, 17, 15, 12, 9, 6, 3, 1);
  }
}

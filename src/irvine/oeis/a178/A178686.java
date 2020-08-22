package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178686 Expansion of the polynomial (1+x^3)*(1+x^5)*(1+x^7)*(1+x^9).
 * @author Georg Fischer
 */
public class A178686 extends FiniteSequence {

  /** Construct the sequence. */
  public A178686() {
    super(1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 2, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1);
  }
}

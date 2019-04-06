package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178691 Expansion of the polynomial (1+x^3)*(1+x^5)*(1+x^7)*(1+x^9)*(1+x^11)*(1+x^13).
 * @author Georg Fischer
 */
public class A178691 extends FiniteSequence {

  /** Construct the sequence. */
  public A178691() {
    super(1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 2, 1, 3, 1, 2, 2, 2, 3, 1, 3, 2, 3, 1, 3, 2, 2, 2, 1, 3, 1, 2, 1, 2, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1);
  }
}

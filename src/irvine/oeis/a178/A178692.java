package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178692 Expansion of the polynomial <code>(1+x^3)*(1+x^5)*(1+x^7)*(1+x^9)*(1+x^11)*(1+x^13)*(1+x^15)</code>.
 * @author Georg Fischer
 */
public class A178692 extends FiniteSequence {

  /** Construct the sequence. */
  public A178692() {
    super(1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 2, 2, 3, 1, 3, 2, 3, 3, 2, 4, 3, 4, 2, 5, 3, 4, 3, 4, 4, 3, 4, 3, 5, 2, 4, 3, 4, 2, 3, 3, 2, 3, 1, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1);
  }
}

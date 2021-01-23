package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178696 Expansion of the polynomial (1+x^3)*(1+x^5)*(1+x^7)*(1+x^9)*(1+x^11)*(1+x^13)*(1+x^15)*(1+x^17)*(1+x^19).
 * @author Georg Fischer
 */
public class A178696 extends FiniteSequence {

  /** Construct the sequence. */
  public A178696() {
    super(1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 2, 2, 3, 2, 3, 3, 4, 3, 4, 4, 5, 5, 4, 7, 5, 7, 5, 8, 7, 8, 7, 9, 9, 8, 9, 9, 11, 8, 11, 9, 12, 9, 11, 10, 12, 10, 10, 12, 10, 11, 9, 12, 9, 11, 8, 11, 9, 9, 8, 9, 9, 7, 8, 7, 8, 5, 7, 5, 7, 4, 5, 5, 4, 4, 3, 4, 3, 3, 2, 3, 2, 2, 1, 2, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1);
  }
}

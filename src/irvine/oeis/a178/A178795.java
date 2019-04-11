package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178795 Expansion of the polynomial <code>(x^15-1)*(x^12-1)*(x^10-1)*(x^9-1)*(x^7-1)*(x^6-1)*(x^4-1)*(x-1)</code> in increasing powers of x.
 * @author Georg Fischer
 */
public class A178795 extends FiniteSequence {

  /** Construct the sequence. */
  public A178795() {
    super(1, -1, 0, 0, -1, 1, -1, 0, 1, -1, 1, 1, -2, 3, -1, -1, 3, -3, 1, 1, -4, 3, -1, -3, 4, -4, 1, 3, -5, 4, 0, -3, 6, -3, 0, 4, -5, 3, 1, -4, 4, -3, -1, 3, -4, 1, 1, -3, 3, -1, -1, 3, -2, 1, 1, -1, 1, 0, -1, 1, -1, 0, 0, -1, 1);
  }
}

package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178781 Expansion of the polynomial (x^9-1)*(x^7-1)*(x^6-1)*(x^5-1)*(x^4-1)*(x^3-1)*(x-1) in increasing powers of x.
 * @author Georg Fischer
 */
public class A178781 extends FiniteSequence {

  /** Construct the sequence. */
  public A178781() {
    super(-1, 1, 0, 1, 0, 0, 0, -1, -1, 0, -1, 0, 1, 0, 2, 0, 1, 0, 0, -1, 0, -2, 0, -1, 0, 1, 0, 1, 1, 0, 0, 0, -1, 0, -1, 1);
  }
}

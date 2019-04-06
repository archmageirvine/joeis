package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178779 Expansion of the polynomial x^12*(x^6-1)*(x^4-1)*(x^3-1)*(x-1) in increasing powers of x.
 * @author Georg Fischer
 */
public class A178779 extends FiniteSequence {

  /** Construct the sequence. */
  public A178779() {
    super(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, -1, 0, 1, -1, 2, -1, 1, 0, -1, 0, -1, 1);
  }
}

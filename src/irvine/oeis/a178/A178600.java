package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178600 Expansion of the polynomial <code>(1+x^3)*(1+x^11)</code>.
 * @author Georg Fischer
 */
public class A178600 extends FiniteSequence {

  /** Construct the sequence. */
  public A178600() {
    super(1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1);
  }
}

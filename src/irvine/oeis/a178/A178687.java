package irvine.oeis.a178;

import irvine.oeis.FiniteSequence;

/**
 * A178687 Expansion of the polynomial <code>(1+x^3)*(1+x^5)*(1+x^7)*(1+x^9)*(1+x^11)</code>.
 * @author Georg Fischer
 */
public class A178687 extends FiniteSequence {

  /** Construct the sequence. */
  public A178687() {
    super(1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 0, 2, 1, 2, 1, 1, 2, 1, 2, 0, 2, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1);
  }
}

package irvine.oeis.a198;

import irvine.oeis.FiniteSequence;

/**
 * A198861 The number of ways to paint the faces of the five Platonic solids using exactly n colors where n is the number of faces of each solid.
 * @author Georg Fischer
 */
public class A198861 extends FiniteSequence {

  /** Construct the sequence. */
  public A198861() {
    super(1, FINITE, 2, 30, 1680, 7983360, 40548366802944000L);
  }
}

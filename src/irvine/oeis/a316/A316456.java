package irvine.oeis.a316;

import irvine.oeis.FiniteSequence;

/**
 * A316456 Complete list of solutions to y^2 = x^3 - 7x + 10; sequence gives x values.
 * @author Georg Fischer
 */
public class A316456 extends FiniteSequence {

  /** Construct the sequence. */
  public A316456() {
    super(1, FINITE, -3, -2, -1, 1, 2, 3, 5, 9, 13, 31, 41, 67, 302);
  }
}

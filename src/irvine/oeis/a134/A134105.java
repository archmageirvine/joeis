package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134105 Complete list of solutions to y^2 = x^3 + 297; sequence gives x values.
 * @author Georg Fischer
 */
public class A134105 extends FiniteSequence {

  /** Construct the sequence. */
  public A134105() {
    super(1, FINITE, -6, -2, 3, 4, 12, 34, 48, 1362, 93844);
  }
}

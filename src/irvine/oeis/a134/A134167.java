package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134167 Complete list of solutions to y^2 = x^3 + 1025; sequence gives x values.
 * @author Georg Fischer
 */
public class A134167 extends FiniteSequence {

  /** Construct the sequence. */
  public A134167() {
    super(1, FINITE, -10, -5, -4, -1, 4, 10, 20, 40, 50, 64, 155, 166, 446, 920, 3631, 3730);
  }
}

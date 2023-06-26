package irvine.oeis.a134;

import irvine.oeis.FiniteSequence;

/**
 * A134043 Complete list of solutions to y^2 = x^3 + 113; sequence gives y values.
 * @author Georg Fischer
 */
public class A134043 extends FiniteSequence {

  /** Construct the sequence. */
  public A134043() {
    super(1, FINITE, 7, 11, 25, 38, 133, 8669);
  }
}

package irvine.oeis.a249;

import irvine.oeis.FiniteSequence;

/**
 * A249947 Number of available orbitals at increasing subshells in multi-electron atoms.
 * @author Georg Fischer
 */
public class A249947 extends FiniteSequence {

  /** Construct the sequence. */
  public A249947() {
    super(1, FINITE, 1, 1, 3, 1, 3, 1, 5, 3, 1, 5, 3, 1, 7, 5, 3, 1, 7, 5, 3);
  }
}

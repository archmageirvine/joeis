package irvine.oeis.a228;

import irvine.oeis.FiniteSequence;

/**
 * A228211 Decimal expansion of Legendre's constant (incorrect, the true value is 1, as in A000007).
 * @author Georg Fischer
 */
public class A228211 extends FiniteSequence {

  /** Construct the sequence. */
  public A228211() {
    super(1, FINITE, 1, 0, 8, 3, 6, 6);
  }
}

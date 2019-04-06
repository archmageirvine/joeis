package irvine.oeis.a020;

import irvine.oeis.FiniteSequence;

/**
 * A020489 phi(n) divides sigma_0(n).
 * @author Georg Fischer
 */
public class A020489 extends FiniteSequence {

  /** Construct the sequence. */
  public A020489() {
    super(1, 2, 3, 6, 8, 10, 18, 24, 30);
  }
}

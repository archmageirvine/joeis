package irvine.oeis.a393;

import irvine.oeis.FiniteSequence;

/**
 * A393481 Numbers k such that sigma(k) = psi(k) + tau(k) + Omega(k)^8.
 * @author Sean A. Irvine
 */
public class A393481 extends FiniteSequence {

  /** Construct the sequence. */
  public A393481() {
    super(1, FINITE, 4285700, 4496900);
  }
}

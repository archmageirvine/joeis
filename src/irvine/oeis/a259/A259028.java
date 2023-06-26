package irvine.oeis.a259;

import irvine.oeis.FiniteSequence;

/**
 * A259028 a(n) = least number m such that digital root of m is n*(digital root of m-th prime).
 * @author Georg Fischer
 */
public class A259028 extends FiniteSequence {

  /** Construct the sequence. */
  public A259028() {
    super(1, FINITE, 25, 29, 12, 26, 131, 42, 106, 8, 63);
  }
}

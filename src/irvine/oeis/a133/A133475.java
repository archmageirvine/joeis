package irvine.oeis.a133;

import irvine.oeis.FiniteSequence;

/**
 * A133475 Integers n such that n^3 + n^2 - 9*n + 16 is a square.
 * @author Georg Fischer
 */
public class A133475 extends FiniteSequence {

  /** Construct the sequence. */
  public A133475() {
    super(1, FINITE, -4, -3, -1, 0, 1, 3, 5, 11, 15, 28, 47, 55, 81, 549, 1799, 8361);
  }
}

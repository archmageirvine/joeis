package irvine.oeis.a055;

import irvine.oeis.FiniteSequence;

/**
 * A055577 Numbers k such that the sum of digits of k^6 is equal to k.
 * @author Georg Fischer
 */
public class A055577 extends FiniteSequence {

  /** Construct the sequence. */
  public A055577() {
    super(1, FINITE, 0, 1, 18, 45, 54, 64);
  }
}

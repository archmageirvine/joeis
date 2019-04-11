package irvine.oeis.a254;

import irvine.oeis.FiniteSequence;

/**
 * A254329 Numbers n such that all <code>x^2 mod n</code> are prime powers (including 0 and 1).
 * @author Georg Fischer
 */
public class A254329 extends FiniteSequence {

  /** Construct the sequence. */
  public A254329() {
    super(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 14, 16, 20, 32);
  }
}

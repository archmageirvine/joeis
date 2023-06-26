package irvine.oeis.a229;

import irvine.oeis.FiniteSequence;

/**
 * A229384 Positive integer solutions y1, x1, y2, x2 to Ljunggren's equation x^2 + 1 = 2y^4.
 * @author Georg Fischer
 */
public class A229384 extends FiniteSequence {

  /** Construct the sequence. */
  public A229384() {
    super(1, FINITE, 1, 1, 13, 239);
  }
}

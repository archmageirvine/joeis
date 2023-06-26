package irvine.oeis.a023;

import irvine.oeis.FiniteSequence;

/**
 * A023786 Katadromes: digits in base 4 are in strict descending order.
 * @author Georg Fischer
 */
public class A023786 extends FiniteSequence {

  /** Construct the sequence. */
  public A023786() {
    super(1, FINITE, 0, 1, 2, 3, 4, 8, 9, 12, 13, 14, 36, 52, 56, 57, 228);
  }
}

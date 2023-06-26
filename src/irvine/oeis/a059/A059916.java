package irvine.oeis.a059;

import irvine.oeis.FiniteSequence;

/**
 * A059916 Nonnegative integers that when written out in full in English have no repeated letter.
 * @author Georg Fischer
 */
public class A059916 extends FiniteSequence {

  /** Construct the sequence. */
  public A059916() {
    super(1, FINITE, 0, 1, 2, 4, 5, 6, 8, 10, 40, 46, 60, 61, 64, 80, 84, 5000);
  }
}

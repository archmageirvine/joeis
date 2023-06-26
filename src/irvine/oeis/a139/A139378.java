package irvine.oeis.a139;

import irvine.oeis.FiniteSequence;

/**
 * A139378 Number of 2-digit multiples of n whose digits sum to n.
 * @author Georg Fischer
 */
public class A139378 extends FiniteSequence {

  /** Construct the sequence. */
  public A139378() {
    super(1, FINITE, 1, 1, 3, 1, 1, 3, 1, 1, 9);
  }
}

package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036748 Number of strings of n distinct digits from 0-9 that are the last n digits of a square in base 6.
 * @author Georg Fischer
 */
public class A036748 extends FiniteSequence {

  /** Construct the sequence. */
  public A036748() {
    super(1, FINITE, 4, 6, 16, 34, 59, 56);
  }
}

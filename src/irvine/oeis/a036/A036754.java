package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036754 Number of strings of n distinct digits from 1-9 that are the last n digits of a square in base 9.
 * @author Georg Fischer
 */
public class A036754 extends FiniteSequence {

  /** Construct the sequence. */
  public A036754() {
    super(1, FINITE, 3, 21, 126, 630, 2520, 7560, 15120, 15120);
  }
}

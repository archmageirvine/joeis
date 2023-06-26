package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036749 Number of strings of n distinct digits from 0-9 that are the last n digits of a square in base 7.
 * @author Georg Fischer
 */
public class A036749 extends FiniteSequence {

  /** Construct the sequence. */
  public A036749() {
    super(1, FINITE, 4, 18, 90, 360, 1080, 2160, 2160);
  }
}

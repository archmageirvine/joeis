package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036752 Number of strings of n distinct digits from 1-9 that are the last n digits of a square in base 8.
 * @author Georg Fischer
 */
public class A036752 extends FiniteSequence {

  /** Construct the sequence. */
  public A036752() {
    super(1, FINITE, 2, 6, 30, 120, 360, 720, 720);
  }
}

package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036756 Number of strings of n distinct digits from 1-9 that are the last n digits of a square in base 10.
 * @author Georg Fischer
 */
public class A036756 extends FiniteSequence {

  /** Construct the sequence. */
  public A036756() {
    super(1, FINITE, 5, 17, 85, 340, 1468, 5076, 14659, 28198, 27901);
  }
}

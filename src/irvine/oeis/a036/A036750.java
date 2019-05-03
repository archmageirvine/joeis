package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036750 Number of strings of n distinct digits from 1-9 that are the last n digits of a square in base 7.
 * @author Georg Fischer
 */
public class A036750 extends FiniteSequence {

  /** Construct the sequence. */
  public A036750() {
    super(3, 15, 60, 180, 360, 360);
  }
}

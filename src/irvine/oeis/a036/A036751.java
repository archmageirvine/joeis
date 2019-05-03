package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036751 Number of strings of n distinct digits from 0-9 that are the last n digits of a square in base 8.
 * @author Georg Fischer
 */
public class A036751 extends FiniteSequence {

  /** Construct the sequence. */
  public A036751() {
    super(3, 9, 50, 250, 1000, 3000, 6000, 6000);
  }
}

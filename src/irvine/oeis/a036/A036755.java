package irvine.oeis.a036;

import irvine.oeis.FiniteSequence;

/**
 * A036755 Number of strings of n distinct digits from 0-9 that are the last n digits of a square in base 10.
 * @author Georg Fischer
 */
public class A036755 extends FiniteSequence {

  /** Construct the sequence. */
  public A036755() {
    super(1, FINITE, 6, 20, 114, 543, 2868, 12447, 47904, 138055, 273295, 270451);
  }
}

package irvine.oeis.a189;

import irvine.oeis.FiniteSequence;

/**
 * A189916 Sequence for finding the day of the week for the first day of the month in leap years.
 * @author Georg Fischer
 */
public class A189916 extends FiniteSequence {

  /** Construct the sequence. */
  public A189916() {
    super(1, FINITE, 0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6);
  }
}

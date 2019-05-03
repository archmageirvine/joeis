package irvine.oeis.a189;

import irvine.oeis.FiniteSequence;

/**
 * A189915 Sequence for finding the day of the week for the first day of the month in a common <code>(non-leap)</code> year.
 * @author Georg Fischer
 */
public class A189915 extends FiniteSequence {

  /** Construct the sequence. */
  public A189915() {
    super(0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5);
  }
}

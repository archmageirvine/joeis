package irvine.oeis.a090;

import irvine.oeis.FiniteSequence;

/**
 * A090812 Integers from 0 to 16 in French alphabetical order, stopping at 16 because the next contains a hyphen.
 * @author Georg Fischer
 */
public class A090812 extends FiniteSequence {

  /** Construct the sequence. */
  public A090812() {
    super(5, 2, 10, 12, 8, 9, 11, 14, 4, 15, 16, 7, 6, 13, 3, 1, 0);
  }
}

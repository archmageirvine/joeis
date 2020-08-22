package irvine.oeis.a105;

import irvine.oeis.FiniteSequence;

/**
 * A105386 Morse code alphabet where "." = 0 and "-" = 1, binary converted to decimal.
 * @author Georg Fischer
 */
public class A105386 extends FiniteSequence {

  /** Construct the sequence. */
  public A105386() {
    super(1, 8, 10, 4, 0, 2, 6, 0, 0, 7, 5, 4, 3, 2, 7, 6, 13, 2, 0, 1, 1, 1, 3, 9, 11, 12);
  }
}

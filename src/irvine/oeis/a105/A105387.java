package irvine.oeis.a105;

import irvine.oeis.FiniteSequence;

/**
 * A105387 Morse code alphabet where "-" <code>= 0</code> and "." <code>= 1</code>.
 * @author Georg Fischer
 */
public class A105387 extends FiniteSequence {

  /** Construct the sequence. */
  public A105387() {
    super(2, 7, 5, 3, 1, 13, 1, 15, 3, 8, 2, 11, 0, 1, 0, 9, 2, 5, 7, 0, 6, 14, 4, 6, 4, 3);
  }
}

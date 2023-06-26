package irvine.oeis.a240;

import irvine.oeis.FiniteSequence;

/**
 * A240564 A number (where A=1, B=2...) for every letter in the capitalized alphabet that does not have a curved line in the letter.
 * @author Georg Fischer
 */
public class A240564 extends FiniteSequence {

  /** Construct the sequence. */
  public A240564() {
    super(1, FINITE, 1, 5, 6, 8, 9, 11, 12, 13, 14, 20, 22, 23, 24, 25, 26);
  }
}

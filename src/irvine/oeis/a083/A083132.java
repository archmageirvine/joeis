package irvine.oeis.a083;

import irvine.oeis.FiniteSequence;

/**
 * A083132 Number the letters of English alphabet from 1 to 26; sequence specifies capital letters with up-down symmetry.
 * @author Georg Fischer
 */
public class A083132 extends FiniteSequence {

  /** Construct the sequence. */
  public A083132() {
    super(2, 3, 4, 5, 8, 9, 11, 15, 24);
  }
}

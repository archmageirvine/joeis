package irvine.oeis.a083;

import irvine.oeis.FiniteSequence;

/**
 * A083133 Number the letters of English alphabet from 1 to 26; sequence specifies capital letters with no symmetry.
 * @author Georg Fischer
 */
public class A083133 extends FiniteSequence {

  /** Construct the sequence. */
  public A083133() {
    super(1, FINITE, 6, 7, 10, 12, 16, 17, 18);
  }
}

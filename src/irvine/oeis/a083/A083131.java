package irvine.oeis.a083;

import irvine.oeis.FiniteSequence;

/**
 * A083131 Number the letters of English alphabet from 1 to 26; sequence specifies capital letters with left-right symmetry.
 * @author Georg Fischer
 */
public class A083131 extends FiniteSequence {

  /** Construct the sequence. */
  public A083131() {
    super(1, 8, 9, 13, 15, 20, 21, 22, 23, 24, 25);
  }
}

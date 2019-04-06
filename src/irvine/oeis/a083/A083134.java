package irvine.oeis.a083;

import irvine.oeis.FiniteSequence;

/**
 * A083134 Number the letters of English alphabet from 1 to 26; sequence specifies capital letters which are indistinguishable after 180 degree rotation.
 * @author Georg Fischer
 */
public class A083134 extends FiniteSequence {

  /** Construct the sequence. */
  public A083134() {
    super(8, 9, 14, 15, 19, 24, 26);
  }
}

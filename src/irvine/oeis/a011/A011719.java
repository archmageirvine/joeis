package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011719 A binary m-sequence: expansion of reciprocal of <code>x^8+x^5+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011719 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011719() {
    super(8, 0b10010101);
  }
}

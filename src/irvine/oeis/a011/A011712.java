package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011712 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^5+x^4+1</code>.
 * @author Sean A. Irvine
 */
public class A011712 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011712() {
    super(8, 0b11011000);
  }
}

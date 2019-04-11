package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011707 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^6+x^4+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011707 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011707() {
    super(8, 0b11101011);
  }
}

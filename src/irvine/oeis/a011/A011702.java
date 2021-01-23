package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011702 A binary m-sequence: expansion of reciprocal of x^8+x^7+x^5+x^4+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011702 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011702() {
    super(8, 0b11011110);
  }
}

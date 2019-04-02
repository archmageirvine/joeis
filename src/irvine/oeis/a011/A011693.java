package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011693 A binary m-sequence: expansion of reciprocal of x^8+x^5+x^4+x^3+1.
 * @author Sean A. Irvine
 */
public class A011693 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011693() {
    super(8, 0b10011100);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011705 A binary m-sequence: expansion of reciprocal of x^8+x^7+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011705 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011705() {
    super(8, 0b11000110);
  }
}

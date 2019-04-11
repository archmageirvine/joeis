package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011705 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011705 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011705() {
    super(8, 0b11000110);
  }
}

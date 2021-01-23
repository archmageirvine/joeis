package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011665 A binary m-sequence: expansion of reciprocal of x^5+x^4+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011665 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011665() {
    super(5, 0b11110);
  }
}

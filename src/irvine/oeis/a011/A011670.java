package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011670 A binary m-sequence: expansion of reciprocal of x^6+x^4+x^3+x+1.
 * @author Sean A. Irvine
 */
public class A011670 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011670() {
    super(6, 0b101101);
  }
}

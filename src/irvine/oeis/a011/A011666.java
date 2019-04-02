package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011666 A binary m-sequence: expansion of reciprocal of x^6+x^5+x^4+x+1.
 * @author Sean A. Irvine
 */
public class A011666 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011666() {
    super(6, 0b111001);
  }
}

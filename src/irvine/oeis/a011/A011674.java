package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011674 A binary m-sequence: expansion of reciprocal of x^7+x^6+x^5+x^4+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011674 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011674() {
    super(7, 0b1111110);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011687 A binary m-sequence: expansion of reciprocal of <code>x^7 + x^6 + x^5 + x^4 + 1</code>.
 * @author Sean A. Irvine
 */
public class A011687 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011687() {
    super(7, 0b1111000);
  }
}

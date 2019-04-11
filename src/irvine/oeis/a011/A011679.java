package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011679 A binary m-sequence: expansion of reciprocal of <code>x^7+x^6+x^4+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011679 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011679() {
    super(7, 0b1101001);
  }
}

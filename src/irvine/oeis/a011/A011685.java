package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011685 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^7+x^6+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011685 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011685() {
    super(7, 0b1100101);
  }
}

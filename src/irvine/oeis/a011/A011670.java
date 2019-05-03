package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011670 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^6+x^4+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011670 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011670() {
    super(6, 0b101101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011671 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^6+x^5+x^4+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011671 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011671() {
    super(6, 0b111010);
  }
}

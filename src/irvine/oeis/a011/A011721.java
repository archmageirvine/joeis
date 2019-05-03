package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011721 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^6+x^5+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011721 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011721() {
    super(8, 0b10110100);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011662 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^5 + x^2 + 1</code>.
 * @author Sean A. Irvine
 */
public class A011662 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011662() {
    super(5, 0b10010);
  }
}

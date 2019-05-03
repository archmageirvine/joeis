package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011725 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^12+x^7+x^4+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011725 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011725() {
    super(12, 0b100001001100);
  }
}

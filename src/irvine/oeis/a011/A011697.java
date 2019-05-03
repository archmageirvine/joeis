package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011697 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^4+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011697 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011697() {
    super(8, 0b10001110);
  }
}

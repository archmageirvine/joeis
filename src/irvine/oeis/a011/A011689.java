package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011689 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^7+x^3+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011689 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011689() {
    super(7, 0b1000111);
  }
}

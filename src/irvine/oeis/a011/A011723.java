package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011723 A binary m-sequence: expansion of reciprocal of <code>x^10+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011723 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011723() {
    super(10, 0b1000000100);
  }
}

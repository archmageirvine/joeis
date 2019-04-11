package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011730 A binary m-sequence: expansion of reciprocal of <code>x^17+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011730 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011730() {
    super(17, 0b10000000000000100);
  }
}

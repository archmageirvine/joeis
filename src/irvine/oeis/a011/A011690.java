package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011690 A binary m-sequence: expansion of reciprocal of <code>x^7+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011690 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011690() {
    super(7, 0b1000100);
  }
}

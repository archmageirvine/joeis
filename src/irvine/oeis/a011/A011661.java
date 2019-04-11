package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011661 A binary m-sequence: expansion of reciprocal of <code>x^5+x^3+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011661 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011661() {
    super(5, 0b10111);
  }
}

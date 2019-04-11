package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011663 A binary m-sequence: expansion of reciprocal of <code>x^5+x^4+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011663 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011663() {
    super(5, 0b11101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011722 A binary m-sequence: expansion of reciprocal of <code>x^9+x^4+1</code>.
 * @author Sean A. Irvine
 */
public class A011722 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011722() {
    super(9, 0b100001000);
  }
}

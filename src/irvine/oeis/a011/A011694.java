package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011694 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^5+x^3+1</code>.
 * @author Sean A. Irvine
 */
public class A011694 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011694() {
    super(8, 0b11010100);
  }
}

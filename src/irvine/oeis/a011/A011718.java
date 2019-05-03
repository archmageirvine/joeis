package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011718 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^8+x^6+x^5+x^4+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011718 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011718() {
    super(8, 0b10111101);
  }
}

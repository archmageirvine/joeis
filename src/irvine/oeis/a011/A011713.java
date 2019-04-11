package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011713 A binary m-sequence: expansion of reciprocal of <code>x^8+x^6+x^5+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011713 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011713() {
    super(8, 0b10110001);
  }
}

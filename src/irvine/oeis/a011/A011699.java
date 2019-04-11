package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011699 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^5+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011699 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011699() {
    super(8, 0b11010001);
  }
}

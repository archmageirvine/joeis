package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011739 A binary m-sequence: expansion of reciprocal of <code>x^26 + x^8 + x^7 + x + 1 (mod 2</code>, shifted by 25 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011739 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011739() {
    super(26, 0b10000000000000000011000001);
  }
}

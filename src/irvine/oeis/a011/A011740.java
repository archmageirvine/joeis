package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011740 A binary m-sequence: expansion of reciprocal of <code>x^27 + x^8 + x^7 + x + 1 (mod 2</code>, shifted by 26 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011740 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011740() {
    super(27, 0b100000000000000000011000001);
  }
}

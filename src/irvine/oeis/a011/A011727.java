package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011727 A binary m-sequence: expansion of reciprocal of x^14 + x^12 + x^11 + x + 1 (mod 2, shifted by 13 initial 0's).
 * @author Sean A. Irvine
 */
public class A011727 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011727() {
    super(14, 0b10110000000001);
  }
}

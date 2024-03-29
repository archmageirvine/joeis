package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011744 A binary m-sequence: expansion of reciprocal of x^31 + x^3 + 1 (mod 2, shifted by 30 initial 0's).
 * @author Sean A. Irvine
 */
public class A011744 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011744() {
    super(31, 0b1000000000000000000000000000100);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011731 A binary m-sequence: expansion of reciprocal of x^18 + x^7 + 1 (mod 2, shifted by 17 initial 0's).
 * @author Sean A. Irvine
 */
public class A011731 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011731() {
    super(18, 0b100000000001000000);
  }
}

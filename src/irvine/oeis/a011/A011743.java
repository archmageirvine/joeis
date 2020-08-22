package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011743 A binary m-sequence: expansion of reciprocal of x^30 + x^16 + x^15 + x + 1 (mod 2, shifted by 29 initial 0's).
 * @author Sean A. Irvine
 */
public class A011743 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011743() {
    super(30, 0b100000000000001100000000000001);
  }
}

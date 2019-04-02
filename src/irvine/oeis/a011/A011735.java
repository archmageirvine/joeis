package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011735 A binary m-sequence: expansion of reciprocal of x^22 + x + 1 (mod 2, shifted by 21 initial 0's).
 * @author Sean A. Irvine
 */
public class A011735 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011735() {
    super(22, 0b1000000000000000000001);
  }
}

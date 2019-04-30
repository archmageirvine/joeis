package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011733 A binary m-sequence: expansion of reciprocal of <code>x^20 + x^3 + 1 (mod 2</code>, shifted by 19 initial 0's).
 * @author Sean A. Irvine
 */
public class A011733 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011733() {
    super(20, 0b10000000000000000100);
  }
}

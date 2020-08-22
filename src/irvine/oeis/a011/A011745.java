package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011745 A binary m-sequence: expansion of reciprocal of x^32 + x^28 + x^27 + x + 1 (mod 2, shifted by 31 initial 0's).
 * @author Sean A. Irvine
 */
public class A011745 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011745() {
    super(32, 0b10001100000000000000000000000001L);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011742 A binary m-sequence: expansion of reciprocal of x^29 + x^2 + 1 (mod 2, shifted by 28 initial 0's).
 * @author Sean A. Irvine
 */
public class A011742 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011742() {
    super(29, 0b10000000000000000000000000010);
  }
}

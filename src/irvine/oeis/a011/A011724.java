package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011724 A binary m-sequence: expansion of reciprocal of x^11 + x^2 + 1 (mod 2, shifted by 10 initial 0's).
 * @author Sean A. Irvine
 */
public class A011724 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011724() {
    super(11, 0b10000000010);
  }
}

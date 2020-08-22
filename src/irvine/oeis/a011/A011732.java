package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011732 A binary m-sequence: expansion of reciprocal of x^19 + x^6 + x^5 + x + 1 (mod 2, shifted by 18 initial 0's).
 * @author Sean A. Irvine
 */
public class A011732 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011732() {
    super(19, 0b1000000000000110001);
  }
}

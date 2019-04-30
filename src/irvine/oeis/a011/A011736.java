package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011736 A binary m-sequence: expansion of reciprocal of <code>x^23 + x^5 + 1 (mod 2</code>, shifted by 22 initial 0's).
 * @author Sean A. Irvine
 */
public class A011736 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011736() {
    super(23, 0b10000000000000000010000);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011737 A binary m-sequence: expansion of reciprocal of <code>x^24 + x^4 + x^3 + x + 1 (mod 2</code>, shifted by 23 initial 0's).
 * @author Sean A. Irvine
 */
public class A011737 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011737() {
    super(24, 0b100000000000000000001101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011738 A binary m-sequence: expansion of reciprocal of <code>x^25 + x^3 + 1 (mod 2</code>, shifted by 24 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011738 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011738() {
    super(25, 0b1000000000000000000000100);
  }
}

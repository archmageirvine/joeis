package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011741 A binary m-sequence: expansion of reciprocal of <code>x^28 + x^3 + 1 (mod 2</code>, shifted by 27 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011741 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011741() {
    super(28, 0b1000000000000000000000000100);
  }
}

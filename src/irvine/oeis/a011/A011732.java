package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011732 A binary m-sequence: expansion of reciprocal of <code>x^19 + x^6 + x^5 + x + 1 (mod 2</code>, shifted by 18 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011732 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011732() {
    super(19, 0b1000000000000110001);
  }
}

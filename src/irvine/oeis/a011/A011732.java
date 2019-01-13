package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011732.
 * @author Sean A. Irvine
 */
public class A011732 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011732() {
    super(19, 0b1000000000000110001);
  }
}

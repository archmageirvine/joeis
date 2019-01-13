package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011663.
 * @author Sean A. Irvine
 */
public class A011663 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011663() {
    super(5, 0b11101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011685.
 * @author Sean A. Irvine
 */
public class A011685 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011685() {
    super(7, 0b1100101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011670.
 * @author Sean A. Irvine
 */
public class A011670 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011670() {
    super(6, 0b101101);
  }
}

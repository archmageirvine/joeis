package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011679.
 * @author Sean A. Irvine
 */
public class A011679 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011679() {
    super(7, 0b1101001);
  }
}

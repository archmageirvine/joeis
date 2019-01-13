package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011690.
 * @author Sean A. Irvine
 */
public class A011690 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011690() {
    super(7, 0b1000100);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011661.
 * @author Sean A. Irvine
 */
public class A011661 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011661() {
    super(5, 0b10111);
  }
}

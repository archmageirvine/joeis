package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011683.
 * @author Sean A. Irvine
 */
public class A011683 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011683() {
    super(7, 0b1011111);
  }
}

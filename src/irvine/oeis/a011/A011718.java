package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011718.
 * @author Sean A. Irvine
 */
public class A011718 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011718() {
    super(8, 0b10111101);
  }
}

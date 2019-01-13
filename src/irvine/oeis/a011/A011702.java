package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011702.
 * @author Sean A. Irvine
 */
public class A011702 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011702() {
    super(8, 0b11011110);
  }
}

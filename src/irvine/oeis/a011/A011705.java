package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011705.
 * @author Sean A. Irvine
 */
public class A011705 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011705() {
    super(8, 0b11000110);
  }
}

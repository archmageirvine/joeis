package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011665.
 * @author Sean A. Irvine
 */
public class A011665 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011665() {
    super(5, 0b11110);
  }
}

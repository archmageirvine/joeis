package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011672.
 * @author Sean A. Irvine
 */
public class A011672 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011672() {
    super(6, 0b100100);
  }
}

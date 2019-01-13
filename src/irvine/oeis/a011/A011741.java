package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011741.
 * @author Sean A. Irvine
 */
public class A011741 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011741() {
    super(28, 0b1000000000000000000000000100);
  }
}

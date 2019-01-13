package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011733.
 * @author Sean A. Irvine
 */
public class A011733 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011733() {
    super(20, 0b10000000000000000100);
  }
}

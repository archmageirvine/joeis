package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011708.
 * @author Sean A. Irvine
 */
public class A011708 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011708() {
    super(8, 0b11100111);
  }
}

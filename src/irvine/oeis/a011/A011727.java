package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011727.
 * @author Sean A. Irvine
 */
public class A011727 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011727() {
    super(14, 0b10110000000001);
  }
}

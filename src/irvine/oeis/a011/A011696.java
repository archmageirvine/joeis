package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011696.
 * @author Sean A. Irvine
 */
public class A011696 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011696() {
    super(8, 0b11111100);
  }
}

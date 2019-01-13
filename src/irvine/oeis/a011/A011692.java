package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011692.
 * @author Sean A. Irvine
 */
public class A011692 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011692() {
    super(8, 0b10101111);
  }
}

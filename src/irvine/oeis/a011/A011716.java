package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011716.
 * @author Sean A. Irvine
 */
public class A011716 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011716() {
    super(8, 0b11111001);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011720.
 * @author Sean A. Irvine
 */
public class A011720 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011720() {
    super(8, 0b11001111);
  }
}

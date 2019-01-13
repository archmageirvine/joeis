package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011707.
 * @author Sean A. Irvine
 */
public class A011707 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011707() {
    super(8, 0b11101011);
  }
}

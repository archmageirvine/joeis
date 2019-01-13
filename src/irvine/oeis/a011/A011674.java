package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011674.
 * @author Sean A. Irvine
 */
public class A011674 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011674() {
    super(7, 0b1111110);
  }
}

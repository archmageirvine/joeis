package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011740.
 * @author Sean A. Irvine
 */
public class A011740 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011740() {
    super(27, 0b100000000000000000011000001);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011739.
 * @author Sean A. Irvine
 */
public class A011739 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011739() {
    super(26, 0b10000000000000000011000001);
  }
}

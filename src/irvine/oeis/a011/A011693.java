package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011693.
 * @author Sean A. Irvine
 */
public class A011693 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011693() {
    super(8, 0b10011100);
  }
}

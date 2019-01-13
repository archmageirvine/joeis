package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011700.
 * @author Sean A. Irvine
 */
public class A011700 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011700() {
    super(8, 0b11000101);
  }
}

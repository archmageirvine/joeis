package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011695.
 * @author Sean A. Irvine
 */
public class A011695 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011695() {
    super(8, 0b11111010);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011671.
 * @author Sean A. Irvine
 */
public class A011671 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011671() {
    super(6, 0b111010);
  }
}

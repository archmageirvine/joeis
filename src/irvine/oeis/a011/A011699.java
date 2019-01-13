package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011699.
 * @author Sean A. Irvine
 */
public class A011699 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011699() {
    super(8, 0b11010001);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011731.
 * @author Sean A. Irvine
 */
public class A011731 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011731() {
    super(18, 0b100000000001000000);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011738.
 * @author Sean A. Irvine
 */
public class A011738 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011738() {
    super(25, 0b1000000000000000000000100);
  }
}

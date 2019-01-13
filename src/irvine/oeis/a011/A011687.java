package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011687.
 * @author Sean A. Irvine
 */
public class A011687 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011687() {
    super(7, 0b1111000);
  }
}

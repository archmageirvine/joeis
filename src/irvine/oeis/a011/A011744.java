package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011744.
 * @author Sean A. Irvine
 */
public class A011744 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011744() {
    super(31, 0b1000000000000000000000000000100);
  }
}

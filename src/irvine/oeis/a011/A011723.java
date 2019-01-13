package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011723.
 * @author Sean A. Irvine
 */
public class A011723 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011723() {
    super(10, 0b1000000100);
  }
}

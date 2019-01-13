package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011689.
 * @author Sean A. Irvine
 */
public class A011689 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011689() {
    super(7, 0b1000111);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011694.
 * @author Sean A. Irvine
 */
public class A011694 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011694() {
    super(8, 0b11010100);
  }
}

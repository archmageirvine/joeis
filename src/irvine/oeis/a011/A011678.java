package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011678.
 * @author Sean A. Irvine
 */
public class A011678 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011678() {
    super(7, 0b1010101);
  }
}

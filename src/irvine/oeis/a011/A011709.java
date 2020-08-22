package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011709 A binary m-sequence: expansion of reciprocal of x^8+x^7+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011709 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011709() {
    super(8, 0b11000011);
  }
}

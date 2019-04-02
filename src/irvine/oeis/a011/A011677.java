package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011677 A binary m-sequence: expansion of reciprocal of x^7+x^5+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011677 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011677() {
    super(7, 0b1010011);
  }
}

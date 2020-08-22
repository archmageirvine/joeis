package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011688 A binary m-sequence: expansion of reciprocal of x^7+x^5+x^4+x^3+1.
 * @author Sean A. Irvine
 */
public class A011688 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011688() {
    super(7, 0b1011100);
  }
}

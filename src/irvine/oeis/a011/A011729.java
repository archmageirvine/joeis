package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011729 A binary m-sequence: expansion of reciprocal of x^16+x^5+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011729 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011729() {
    super(16, 0b1000000000010110);
  }
}

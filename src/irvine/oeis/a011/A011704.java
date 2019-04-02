package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011704 A binary m-sequence: expansion of reciprocal of x^8+x^6+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011704 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011704() {
    super(8, 0b10100110);
  }
}

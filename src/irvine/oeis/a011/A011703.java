package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011703 A binary m-sequence: expansion of reciprocal of x^8+x^7+x^6+x^4+x^3+x^2+1.
 * @author Sean A. Irvine
 */
public class A011703 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011703() {
    super(8, 0b11101110);
  }
}

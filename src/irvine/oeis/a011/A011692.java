package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011692 A binary m-sequence: expansion of reciprocal of x^8+x^6+x^4+x^3+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011692 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011692() {
    super(8, 0b10101111);
  }
}

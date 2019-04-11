package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011701 A binary m-sequence: expansion of reciprocal of <code>x^8+x^5+x^4+x^3+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011701 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011701() {
    super(8, 0b10011111);
  }
}

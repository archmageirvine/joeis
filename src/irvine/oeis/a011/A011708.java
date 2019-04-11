package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011708 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^6+x^3+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011708 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011708() {
    super(8, 0b11100111);
  }
}

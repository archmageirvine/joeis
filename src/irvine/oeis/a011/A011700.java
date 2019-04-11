package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011700 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^3+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011700 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011700() {
    super(8, 0b11000101);
  }
}

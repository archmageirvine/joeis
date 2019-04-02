package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011714 A binary m-sequence: expansion of reciprocal of x^8+x^4+x^3+x+1.
 * @author Sean A. Irvine
 */
public class A011714 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011714() {
    super(8, 0b10001101);
  }
}

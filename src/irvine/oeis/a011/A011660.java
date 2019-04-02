package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011660 A binary m-sequence: expansion of reciprocal of x^5+x^4+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011660 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011660() {
    super(5, 0b11011);
  }
}

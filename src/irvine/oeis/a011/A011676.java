package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011676 A binary m-sequence: expansion of reciprocal of x^7+x^6+x^4+x^2+1.
 * @author Sean A. Irvine
 */
public class A011676 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011676() {
    super(7, 0b1101010);
  }
}

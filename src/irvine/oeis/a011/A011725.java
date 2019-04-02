package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011725 A binary m-sequence: expansion of reciprocal of x^12+x^7+x^4+x^3+1.
 * @author Sean A. Irvine
 */
public class A011725 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011725() {
    super(12, 0b100001001100);
  }
}

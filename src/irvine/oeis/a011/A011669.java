package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011669 A binary m-sequence: expansion of reciprocal of x^6+x+1.
 * @author Sean A. Irvine
 */
public class A011669 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011669() {
    super(6, 0b100001);
  }
}

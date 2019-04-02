package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011726 A binary m-sequence: expansion of reciprocal of x^13+x^4+x^3+x+1.
 * @author Sean A. Irvine
 */
public class A011726 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011726() {
    super(13, 0b1000000001101);
  }
}

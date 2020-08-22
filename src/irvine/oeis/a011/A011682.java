package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011682 A binary m-sequence: expansion of reciprocal of x^7+x+1.
 * @author Sean A. Irvine
 */
public class A011682 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011682() {
    super(7, 0b1000001);
  }
}

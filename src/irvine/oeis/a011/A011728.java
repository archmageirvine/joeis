package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011728 A binary m-sequence: expansion of reciprocal of <code>x^15+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011728 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011728() {
    super(15, 0b100000000000001);
  }
}

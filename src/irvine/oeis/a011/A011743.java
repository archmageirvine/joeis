package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011743.
 * @author Sean A. Irvine
 */
public class A011743 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011743() {
    super(30, 0b100000000000001100000000000001);
  }
}

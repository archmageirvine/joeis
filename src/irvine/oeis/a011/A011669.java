package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011669.
 * @author Sean A. Irvine
 */
public class A011669 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011669() {
    super(6, 0b100001);
  }
}

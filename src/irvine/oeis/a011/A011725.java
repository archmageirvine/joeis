package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011725.
 * @author Sean A. Irvine
 */
public class A011725 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011725() {
    super(12, 0b100001001100);
  }
}

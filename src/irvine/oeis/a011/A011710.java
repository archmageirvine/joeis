package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011710.
 * @author Sean A. Irvine
 */
public class A011710 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011710() {
    super(8, 0b11100001);
  }
}

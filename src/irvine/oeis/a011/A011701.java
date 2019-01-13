package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011701.
 * @author Sean A. Irvine
 */
public class A011701 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011701() {
    super(8, 0b10011111);
  }
}

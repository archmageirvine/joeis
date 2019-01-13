package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011706.
 * @author Sean A. Irvine
 */
public class A011706 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011706() {
    super(8, 0b10110010);
  }
}

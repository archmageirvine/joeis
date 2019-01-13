package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011664.
 * @author Sean A. Irvine
 */
public class A011664 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011664() {
    super(5, 0b10100);
  }
}

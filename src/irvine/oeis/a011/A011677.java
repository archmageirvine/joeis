package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011677.
 * @author Sean A. Irvine
 */
public class A011677 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011677() {
    super(7, 0b1010011);
  }
}

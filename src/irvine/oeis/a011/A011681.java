package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011681.
 * @author Sean A. Irvine
 */
public class A011681 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011681() {
    super(7, 0b1110111);
  }
}

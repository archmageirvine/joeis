package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011736.
 * @author Sean A. Irvine
 */
public class A011736 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011736() {
    super(23, 0b10000000000000000010000);
  }
}

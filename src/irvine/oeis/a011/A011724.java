package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011724.
 * @author Sean A. Irvine
 */
public class A011724 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011724() {
    super(11, 0b10000000010);
  }
}

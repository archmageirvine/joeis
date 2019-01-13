package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011734.
 * @author Sean A. Irvine
 */
public class A011734 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011734() {
    super(21, 0b100000000000000000010);
  }
}

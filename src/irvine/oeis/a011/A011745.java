package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011745.
 * @author Sean A. Irvine
 */
public class A011745 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011745() {
    super(32, 0b10001100000000000000000000000001L);
  }
}

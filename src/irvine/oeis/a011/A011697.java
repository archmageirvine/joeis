package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011697.
 * @author Sean A. Irvine
 */
public class A011697 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011697() {
    super(8, 0b10001110);
  }
}

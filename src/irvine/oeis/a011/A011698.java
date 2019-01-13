package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011698.
 * @author Sean A. Irvine
 */
public class A011698 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011698() {
    super(8, 0b10111011);
  }
}

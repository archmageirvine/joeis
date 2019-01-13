package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011704.
 * @author Sean A. Irvine
 */
public class A011704 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011704() {
    super(8, 0b10100110);
  }
}

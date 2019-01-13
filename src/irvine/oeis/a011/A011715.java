package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011715.
 * @author Sean A. Irvine
 */
public class A011715 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011715() {
    super(8, 0b10111000);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011729.
 * @author Sean A. Irvine
 */
public class A011729 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011729() {
    super(16, 0b1000000000010110);
  }
}

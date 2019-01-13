package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011717.
 * @author Sean A. Irvine
 */
public class A011717 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011717() {
    super(8, 0b10010110);
  }
}

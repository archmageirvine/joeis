package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011673.
 * @author Sean A. Irvine
 */
public class A011673 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011673() {
    super(6, 0b110000);
  }
}

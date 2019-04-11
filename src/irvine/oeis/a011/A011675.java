package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011675 A binary m-sequence: expansion of reciprocal of <code>x^7+x^4+1</code>.
 * @author Sean A. Irvine
 */
public class A011675 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011675() {
    super(7, 0b1001000);
  }
}

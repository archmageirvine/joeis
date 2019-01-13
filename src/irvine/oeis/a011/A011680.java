package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011680.
 * @author Sean A. Irvine
 */
public class A011680 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011680() {
    super(7, 0b1111011);
  }
}

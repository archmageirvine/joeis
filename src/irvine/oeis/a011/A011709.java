package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011709.
 * @author Sean A. Irvine
 */
public class A011709 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011709() {
    super(8, 0b11000011);
  }
}

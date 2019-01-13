package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011691.
 * @author Sean A. Irvine
 */
public class A011691 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011691() {
    super(7, 0b1110010);
  }
}

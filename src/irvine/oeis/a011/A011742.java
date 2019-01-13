package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011742.
 * @author Sean A. Irvine
 */
public class A011742 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011742() {
    super(29, 0b10000000000000000000000000010);
  }
}

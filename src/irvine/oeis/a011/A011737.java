package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011737.
 * @author Sean A. Irvine
 */
public class A011737 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011737() {
    super(24, 0b100000000000000000001101);
  }
}

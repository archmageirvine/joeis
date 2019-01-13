package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011662.
 * @author Sean A. Irvine
 */
public class A011662 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011662() {
    super(5, 0b10010);
  }
}

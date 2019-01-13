package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011660.
 * @author Sean A. Irvine
 */
public class A011660 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011660() {
    super(5, 0b11011);
  }
}

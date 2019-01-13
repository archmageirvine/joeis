package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011711.
 * @author Sean A. Irvine
 */
public class A011711 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011711() {
    super(8, 0b11110011);
  }
}

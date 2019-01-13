package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011719.
 * @author Sean A. Irvine
 */
public class A011719 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011719() {
    super(8, 0b10010101);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011686 A binary m-sequence: expansion of reciprocal of <code>x^7 + x^6 + 1</code>.
 * @author Sean A. Irvine
 */
public class A011686 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011686() {
    super(7, 0b1100000);
  }
}

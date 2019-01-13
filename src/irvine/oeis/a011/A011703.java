package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011703.
 * @author Sean A. Irvine
 */
public class A011703 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011703() {
    super(8, 0b11101110);
  }
}

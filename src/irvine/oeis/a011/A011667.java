package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011667.
 * @author Sean A. Irvine
 */
public class A011667 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011667() {
    super(6, 0b110110);
  }
}

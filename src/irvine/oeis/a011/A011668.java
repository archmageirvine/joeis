package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011668.
 * @author Sean A. Irvine
 */
public class A011668 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011668() {
    super(6, 0b110011);
  }
}

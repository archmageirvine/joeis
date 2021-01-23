package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011668 A binary m-sequence: expansion of reciprocal of x^6+x^5+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011668 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011668() {
    super(6, 0b110011);
  }
}

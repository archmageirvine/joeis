package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011715 A binary m-sequence: expansion of reciprocal of x^8+x^6+x^5+x^4+1.
 * @author Sean A. Irvine
 */
public class A011715 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011715() {
    super(8, 0b10111000);
  }
}

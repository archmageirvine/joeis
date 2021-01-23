package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011711 A binary m-sequence: expansion of reciprocal of x^8+x^7+x^6+x^5+x^2+x+1.
 * @author Sean A. Irvine
 */
public class A011711 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011711() {
    super(8, 0b11110011);
  }
}

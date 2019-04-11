package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011681 A binary m-sequence: expansion of reciprocal of <code>x^7+x^6+x^5+x^3+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011681 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011681() {
    super(7, 0b1110111);
  }
}

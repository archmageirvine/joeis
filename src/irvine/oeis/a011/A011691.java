package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011691 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^7+x^6+x^5+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011691 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011691() {
    super(7, 0b1110010);
  }
}

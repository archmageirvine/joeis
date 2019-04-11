package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011680 A binary m-sequence: expansion of reciprocal of <code>x^7+x^6+x^5+x^4+x^2+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011680 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011680() {
    super(7, 0b1111011);
  }
}

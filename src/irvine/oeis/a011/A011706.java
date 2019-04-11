package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011706 A binary m-sequence: expansion of reciprocal of <code>x^8+x^6+x^5+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011706 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011706() {
    super(8, 0b10110010);
  }
}

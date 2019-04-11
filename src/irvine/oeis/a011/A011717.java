package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011717 A binary m-sequence: expansion of reciprocal of <code>x^8+x^5+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011717 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011717() {
    super(8, 0b10010110);
  }
}

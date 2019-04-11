package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011710 A binary m-sequence: expansion of reciprocal of <code>x^8+x^7+x^6+x+1</code>.
 * @author Sean A. Irvine
 */
public class A011710 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011710() {
    super(8, 0b11100001);
  }
}

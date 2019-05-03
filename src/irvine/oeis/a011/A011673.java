package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011673 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^6+x^5+1</code>.
 * @author Sean A. Irvine
 */
public class A011673 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011673() {
    super(6, 0b110000);
  }
}

package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011667 A binary m-sequence: expansion of reciprocal of <code>x^6+x^5+x^3+x^2+1</code>.
 * @author Sean A. Irvine
 */
public class A011667 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011667() {
    super(6, 0b110110);
  }
}

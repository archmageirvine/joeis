package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011734 A binary <code>m-sequence</code>: expansion of reciprocal of <code>x^21 + x^2 + 1 (mod 2</code>, shifted by 20 initial <code>0's)</code>.
 * @author Sean A. Irvine
 */
public class A011734 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011734() {
    super(21, 0b100000000000000000010);
  }
}

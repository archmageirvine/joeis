package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011672 Expansion of reciprocal of <code>x^6+x^3+1 (mod 2)</code>.
 * @author Sean A. Irvine
 */
public class A011672 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011672() {
    super(6, 0b100100);
  }
}

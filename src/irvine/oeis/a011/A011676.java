package irvine.oeis.a011;

import irvine.oeis.LinearFeedbackShiftRegisterSequence;

/**
 * A011676.
 * @author Sean A. Irvine
 */
public class A011676 extends LinearFeedbackShiftRegisterSequence {

  /** Construct the sequence. */
  public A011676() {
    super(7, 0b1101010);
  }
}

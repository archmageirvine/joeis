package irvine.oeis.a072;

import irvine.oeis.RecordPositionSequence;

/**
 * A072146 Numbers n with property that n sets a new record for the length of the preperiodic part of the 'Reverse and Subtract' trajectory of n.
 * @author Sean A. Irvine
 */
public class A072146 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A072146() {
    super(1, new A072137(), 0);
  }
}

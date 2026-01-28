package irvine.oeis.a083;

import irvine.oeis.RecordPositionSequence;

/**
 * A083383 Positions of records in A083382.
 * @author Sean A. Irvine
 */
public class A083383 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A083383() {
    super(1, 1, new A083382());
  }
}

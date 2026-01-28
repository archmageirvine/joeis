package irvine.oeis.a083;

import irvine.oeis.RecordPositionSequence;

/**
 * A083422 Positions of records in A083403.
 * @author Sean A. Irvine
 */
public class A083422 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A083422() {
    super(1, 1, new A083403());
  }
}

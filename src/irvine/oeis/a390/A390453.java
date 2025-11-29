package irvine.oeis.a390;

import irvine.oeis.RecordPositionSequence;

/**
 * A390453 Indices of records in A390108.
 * @author Sean A. Irvine
 */
public class A390453 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A390453() {
    super(1, new A390108(), 1);
  }
}

package irvine.oeis.a390;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a196.A196047;

/**
 * A390293 Positions of records in A196047.
 * @author Sean A. Irvine
 */
public class A390293 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A390293() {
    super(1, 1, new A196047());
  }
}


package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030722 Positions of records in A030717.
 * @author Sean A. Irvine
 */
public class A030722 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030722() {
    super(1, new A030717(), 1);
  }
}

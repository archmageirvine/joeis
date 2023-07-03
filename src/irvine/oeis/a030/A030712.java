package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030712 Positions of records in A030707.
 * @author Sean A. Irvine
 */
public class A030712 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030712() {
    super(1, new A030707(), 1);
  }
}

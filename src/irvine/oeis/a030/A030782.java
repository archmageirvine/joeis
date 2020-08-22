package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030782 Positions of record values in A030777.
 * @author Sean A. Irvine
 */
public class A030782 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030782() {
    super(new A030777(), 1);
  }
}

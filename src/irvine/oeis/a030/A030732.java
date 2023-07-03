package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030732 Positions of record values in A030727.
 * @author Sean A. Irvine
 */
public class A030732 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030732() {
    super(1, new A030727(), 1);
  }
}

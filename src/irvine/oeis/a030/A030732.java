package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030732 Positions of record values in <code>A030727</code>.
 * @author Sean A. Irvine
 */
public class A030732 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030732() {
    super(new A030727(), 1);
  }
}

package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030712 Positions of records in <code>A030707</code>.
 * @author Sean A. Irvine
 */
public class A030712 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030712() {
    super(new A030707(), 1);
  }
}

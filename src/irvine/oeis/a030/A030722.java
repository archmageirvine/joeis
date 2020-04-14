package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030722 Positions of records in <code>A030717</code>.
 * @author Sean A. Irvine
 */
public class A030722 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030722() {
    super(new A030717(), 1);
  }
}

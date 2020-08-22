package irvine.oeis.a030;

import irvine.oeis.RecordPositionSequence;

/**
 * A030772 Positions of record values in A030767.
 * @author Sean A. Irvine
 */
public class A030772 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A030772() {
    super(new A030767(), 1);
  }
}

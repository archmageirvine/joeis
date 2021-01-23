package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.SkipSequence;

/**
 * A033263 Positions of the incrementally largest terms in the continued fraction for Laplace's limit constant.
 * @author Sean A. Irvine
 */
public class A033263 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033263() {
    super(new SkipSequence(new A033260(), 1), 2);
  }
}

package irvine.oeis.a058;

import irvine.oeis.RecordPositionSequence;

/**
 * A058983 Position at which increasing values of the Improperly Reduced Fibonacci Sequence (A058981) occur.
 * @author Sean A. Irvine
 */
public class A058983 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A058983() {
    super(0, new A058981(), 0);
  }
}

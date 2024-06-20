package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;

/**
 * A070924 Where A070871 sets a new record.
 * @author Sean A. Irvine
 */
public class A070924 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070924() {
    super(1, new A070871(), 1);
  }
}

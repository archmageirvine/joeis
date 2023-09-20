package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;

/**
 * A065926 Index values for new maxima in A065925.
 * @author Sean A. Irvine
 */
public class A065926 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065926() {
    super(1, new A065925(), 1);
  }
}

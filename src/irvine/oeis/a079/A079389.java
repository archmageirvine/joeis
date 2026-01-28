package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079389 Where records occur in A079387.
 * @author Sean A. Irvine
 */
public class A079389 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079389() {
    super(1, 1, new A079387());
  }
}

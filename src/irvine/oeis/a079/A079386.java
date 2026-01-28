package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079386 Where records occur in A079384.
 * @author Sean A. Irvine
 */
public class A079386 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079386() {
    super(1, 1, new A079384());
  }
}

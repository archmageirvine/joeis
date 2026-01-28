package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079380 Where records occur in A079378.
 * @author Sean A. Irvine
 */
public class A079380 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079380() {
    super(1, 1, new A079378());
  }
}

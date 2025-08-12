package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079374 Where records occur in A079372.
 * @author Sean A. Irvine
 */
public class A079374 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079374() {
    super(1, new A079372(), 1);
  }
}

package irvine.oeis.a085;

import irvine.oeis.RecordPositionSequence;

/**
 * A085330 Where records occur in A085068.
 * @author Sean A. Irvine
 */
public class A085330 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A085330() {
    super(1, 0, new A085068());
  }
}

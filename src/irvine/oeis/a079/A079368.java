package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079368 Where records occur in A079366.
 * @author Sean A. Irvine
 */
public class A079368 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079368() {
    super(1, 1, new A079366());
  }
}

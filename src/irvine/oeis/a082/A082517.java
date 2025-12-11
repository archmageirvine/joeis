package irvine.oeis.a082;

import irvine.oeis.RecordPositionSequence;

/**
 * A082517 Numbers n such that N(n+1) - N(n) sets a new record, where N(n) = A005349.
 * @author Sean A. Irvine
 */
public class A082517 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A082517() {
    super(1, new A082516(), 1);
  }
}

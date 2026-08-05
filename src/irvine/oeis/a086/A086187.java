package irvine.oeis.a086;

import irvine.oeis.RecordPositionSequence;

/**
 * A086187 Where records occur in A086183.
 * @author Sean A. Irvine
 */
public class A086187 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A086187() {
    super(1, 1, new A086183());
  }
}

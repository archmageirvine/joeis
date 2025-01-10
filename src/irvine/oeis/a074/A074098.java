package irvine.oeis.a074;

import irvine.oeis.RecordPositionSequence;

/**
 * A074098 Where records occur in A074078.
 * @author Sean A. Irvine
 */
public class A074098 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A074098() {
    super(1, new A074078().skip(), 4);
  }
}

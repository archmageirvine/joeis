package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079371 Where records occur in A079369.
 * @author Sean A. Irvine
 */
public class A079371 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079371() {
    super(1, new A079369(), 1);
  }
}

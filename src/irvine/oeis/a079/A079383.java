package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079383 Where records occur in A079381.
 * @author Sean A. Irvine
 */
public class A079383 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079383() {
    super(1, new A079381(), 1);
  }
}

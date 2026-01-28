package irvine.oeis.a079;

import irvine.oeis.RecordPositionSequence;

/**
 * A079377 Where records occur in A079375.
 * @author Sean A. Irvine
 */
public class A079377 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A079377() {
    super(1, 1, new A079375());
  }
}

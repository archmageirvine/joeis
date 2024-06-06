package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;

/**
 * A070257 Fecundity of n sets a new record.
 * @author Sean A. Irvine
 */
public class A070257 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070257() {
    super(1, new A070562().skip(), 1);
  }
}

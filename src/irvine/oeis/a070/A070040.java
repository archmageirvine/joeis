package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a092.A092419;

/**
 * A070040 Where records occur in A092419.
 * @author Sean A. Irvine
 */
public class A070040 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070040() {
    super(1, new A092419(), 1);
  }
}

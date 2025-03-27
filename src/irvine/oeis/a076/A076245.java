package irvine.oeis.a076;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a051.A051547;

/**
 * A076245 Positions of records in A051547.
 * @author Sean A. Irvine
 */
public class A076245 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A076245() {
    super(1, new A051547(), 1);
  }
}

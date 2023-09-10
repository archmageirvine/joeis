package irvine.oeis.a325;
// manually recpos at 2023-09-10 09:19

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a296.A296062;

/**
 * A325942 Positions of records in A296062.
 * @author Georg Fischer
 */
public class A325942 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A325942() {
    super(1, new A296062(), 0);
  }
}

package irvine.oeis.a131;
// manually 2025-11-09/recpos at 2025-11-09 18:32

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a100.A100949;

/**
 * A131834 Indices of records in A100949.
 * @author Georg Fischer
 */
public class A131834 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A131834() {
    super(1, 1, new A100949());
    next();
  }
}

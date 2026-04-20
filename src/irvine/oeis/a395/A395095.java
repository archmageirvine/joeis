package irvine.oeis.a395;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a295.A295741;

/**
 * A395095 Indices of records in A295741(n) = min {d &gt; 0 | primorial(n)/d + d is a prime}.
 * @author Sean A. Irvine
 */
public class A395095 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A395095() {
    super(1, 0, new A295741());
  }
}

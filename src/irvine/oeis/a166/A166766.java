package irvine.oeis.a166;
// Generated by gen_seq4.pl 2025-02-03.ack/sintrif at 2025-02-03 18:14

import irvine.math.z.Z;
import irvine.oeis.a378.A378934;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A166766 Number of n X 4 1..2 arrays containing at least one of each value, and all equal values connected.
 * @author Georg Fischer
 */
public class A166766 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A166766() {
    super(1, (term, n) -> Z.TWO.multiply(term), "", new A378934());
  }
}

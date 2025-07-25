package irvine.oeis.a213;
// Generated by gen_seq4.pl 2025-07-03.ack/sintrif at 2025-07-03 22:12

import irvine.math.z.Z;
import irvine.oeis.a307.A307103;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A213422 G.f. satisfies: A( A(x) - 4*A(x)^2 ) = x.
 * @author Georg Fischer
 */
public class A213422 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A213422() {
    super(0, (term, n) -> Z.NEG_ONE.pow(n + 1).multiply(term), "", new A307103());
  }
}

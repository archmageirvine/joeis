package irvine.oeis.a085;
// Generated by gen_seq4.pl 2024-07-27.ack/sintrif at 2024-07-27 22:17

import irvine.oeis.a055.A055865;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A085389 a(n) = (n*(n+1)^(n-1) + 0^n)/(n+1).
 * @author Georg Fischer
 */
public class A085389 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A085389() {
    super(1, (term, n) -> term, "1", new A055865());
  }
}

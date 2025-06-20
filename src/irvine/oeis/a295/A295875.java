package irvine.oeis.a295;
// Generated by gen_seq4.pl 2025-06-01.ack/sintrif at 2025-06-01 21:15

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A295875 Let p = A295895(n) = parity of the binary weight of A005940(1+n). If A005940(1+n) is a square or twice a square (in A028982) then a(n) = 1 - p, otherwise a(n) = p.
 * @author Georg Fischer
 */
public class A295875 extends SingleTransformSequence {

  private static final DirectSequence A295896 = new A295896();

  /** Construct the sequence. */
  public A295875() {
    super(0, (term, n) -> term.add(A295896.a(n)).and(Z.ONE), "", new A295895());
  }
}

package irvine.oeis.a193;
// Generated by gen_seq4.pl 2025-06-08.ack/multia at 2025-06-08 23:06

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a110.A110654;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A193281 E.g.f.: A(x) = 1/[(1 - x^2)^(1 + 1/x)].
 * @author Georg Fischer
 */
public class A193281 extends MultiTransformSequence {

  private static final DirectSequence A110654 = new A110654();

  /** Construct the sequence. */
  public A193281() {
    super(0, (self, n) -> Rationals.SINGLETON.sum(1, n, k -> new Q(Z.valueOf(k), A110654.a(k)).multiply(self.a(n - k)).divide(Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n - 1)).num(), "1");
  }
}

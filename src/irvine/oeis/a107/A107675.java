package irvine.oeis.a107;
// Generated by gen_seq4.pl 2025-06-15.ack/multia at 2025-06-15 21:33

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A107675 Column 0 of triangle A107674.
 * @author Georg Fischer
 */
public class A107675 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A107675() {
    super(0, (self, n) -> new Q(n + 1).pow(3 * n + 3).divide(Functions.FACTORIAL.z(n + 1)).subtract(Rationals.SINGLETON.sum(1, n, k -> new Q(n + 1).pow(3 * k).divide(Functions.FACTORIAL.z(k)).multiply(self.a(n - k)))).num(), "1");
  }
}

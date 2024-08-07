package irvine.oeis.a138;
// Generated by gen_seq4.pl 2024-06-12/multrar at 2024-06-12 23:13

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A138292 E.g.f. satisfies A(x) = exp(x*A(x^2)).
 * @author Georg Fischer
 */
public class A138292 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A138292() {
    super(0, (self, n) -> Rationals.SINGLETON.sum(0, (n - 1) / 2, k -> new Q(Z.valueOf(2L * k + 1).multiply(self.a(k)).multiply(self.a(n - 1 - 2 * k)), Functions.FACTORIAL.z(k).multiply(Functions.FACTORIAL.z(n - 1 - 2 * k)))).multiply(Functions.FACTORIAL.z(n - 1)).num(), "1");
  }
}

package irvine.oeis.a294;
// Generated by gen_seq4.pl 2024-07-12/multrar at 2024-07-12 23:14

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A294402 E.g.f.: exp(-Sum_{n&gt;=1} d(n) * x^n), where d(n) is the number of divisors of n.
 * @author Georg Fischer
 */
public class A294402 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A294402() {
    super(0, (self, n) -> Rationals.SINGLETON.sum(1, n, k -> Q.valueOf(k).multiply(Functions.SIGMA0.z(k)).multiply(self.a(n - k)).divide(Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n - 1).negate()).num(), "1");
  }
}

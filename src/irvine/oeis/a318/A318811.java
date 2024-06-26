package irvine.oeis.a318;
// Generated by gen_seq4.pl 2024-06-13/multrar at 2024-06-14 00:04

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.oeis.transform.MultiTransformSequence;

/**
 * A318811 Expansion of e.g.f. exp(Sum_{k&gt;=1} phi(k)*x^k), where phi is the Euler totient function A000010.
 * @author Georg Fischer
 */
public class A318811 extends MultiTransformSequence {

  /** Construct the sequence. */
  public A318811() {
    super(0, (self, n) -> Rationals.SINGLETON.sum(1, n, k -> new Q(Functions.PHI.z(k).multiply(k).multiply(self.a(n - k)), Functions.FACTORIAL.z(n - k))).multiply(Functions.FACTORIAL.z(n - 1)).num(), "1");
  }
}

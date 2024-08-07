package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-03-22/lambdan at 2024-03-24 22:44

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A371198 Expansion of e.g.f. 1/(1 + x^3 * log(1 - x - x^2)).
 * @author Georg Fischer
 */
public class A371198 extends LambdaSequence {

  /** Construct the sequence. */
  public A371198() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, j -> Rationals.SINGLETON.sum(0, j / 3, k -> new Q(Binomial.binomial(j - 2L * k, n - j - k).multiply(Functions.STIRLING1.z(j - 2L * k, k).abs()).multiply(Functions.FACTORIAL.z(k)), Functions.FACTORIAL.z(j - 2 * k))).multiply(Functions.FACTORIAL.z(n))).num());
  }
}

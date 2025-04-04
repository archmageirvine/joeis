package irvine.oeis.a377;
// Generated by gen_seq4.pl 2024-11-01.ack/lambdan at 2024-11-01 22:07

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A377531 Expansion of e.g.f. 1/(1 - x^2 * exp(x))^2.
 * @author Georg Fischer
 */
public class A377531 extends LambdaSequence {

  /** Construct the sequence. */
  public A377531() {
    super(0, n -> Rationals.SINGLETON.sum(0, n / 2, k -> new Q(Z.valueOf(k).pow(n - 2L * k).multiply(Z.valueOf(k + 1))).divide(Functions.FACTORIAL.z(n - 2 * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}

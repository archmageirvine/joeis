package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-02-10.ack/lambdan at 2025-02-10 21:26

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380513 Expansion of e.g.f. exp(x*G(x)) where G(x) = 1 + x*G(x)^4 is the g.f. of A002293.
 * @author Georg Fischer
 */
public class A380513 extends LambdaSequence {

  /** Construct the sequence. */
  public A380513() {
    super(0, n -> (n == 0) ? Z.ONE : Rationals.SINGLETON.sum(0, n - 1, k -> new Q(Binomial.binomial(n + 3L * k, k)).divide(Functions.FACTORIAL.z(n - k - 1).multiply(n + 3L * k))).multiply(Functions.FACTORIAL.z(n)).num());
  }
}

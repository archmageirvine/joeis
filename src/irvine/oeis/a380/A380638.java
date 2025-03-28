package irvine.oeis.a380;
// Generated by gen_seq4.pl 2025-03-28.ack/lambdan at 2025-03-28 22:47

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A380638 Expansion of e.g.f. exp(x*G(4*x)^4) where G(x) = 1 + x*G(x)^4 is the g.f. of A002293.
 * @author Georg Fischer
 */
public class A380638 extends LambdaSequence {

  /** Construct the sequence. */
  public A380638() {
    super(0, n -> (n == 0) ? Z.ONE : Rationals.SINGLETON.sum(0, n - 1, k -> new Q(Z.FOUR.pow(k).multiply(Binomial.binomial(4 * n, k)), Functions.FACTORIAL.z(n - k - 1))).multiply(Functions.FACTORIAL.z(n - 1)).num());
  }
}

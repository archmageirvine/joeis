package irvine.oeis.a366;
// Generated by gen_seq4.pl 2024-03-06/lambdan at 2024-03-06 21:44

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A366402 G.f. A(x) satisfies A(x) = (1 + x * A(x)^(9/2)) / (1 - x).
 * @author Georg Fischer
 */
public class A366402 extends LambdaSequence {

  /** Construct the sequence. */
  public A366402() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> Binomial.binomial(new Q(7L * k, 2).add(n), n - k).multiply(Binomial.binomial(new Q(9L * k, 2), k)).divide(new Q(7L * k, 2).add(Z.ONE))).num());
  }
}

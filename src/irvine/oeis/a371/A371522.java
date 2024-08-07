package irvine.oeis.a371;
// Generated by gen_seq4.pl 2024-04-02/lambdan at 2024-04-02 23:05

import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A371522 G.f. A(x) satisfies A(x) = (1 + x*A(x)^2 / (1-x))^3.
 * @author Georg Fischer
 */
public class A371522 extends LambdaSequence {

  /** Construct the sequence. */
  public A371522() {
    super(0, n -> Rationals.SINGLETON.sum(0, n, k -> new Q(Binomial.binomial(n - 1, n - k).multiply(Binomial.binomial(6L * k + 2, k)), Z.valueOf(5L * k + 3))).multiply(3).num());
  }
}
